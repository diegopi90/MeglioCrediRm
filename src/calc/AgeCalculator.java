package calc;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


public class AgeCalculator
{
   public Age calculateAge(Date birthDate)
   {
      int years = 0;
      int months = 0;
      int days = 0;
      //create calendar object for birth day
      Calendar birthDay = Calendar.getInstance();
      birthDay.setTimeInMillis(birthDate.getTime());
      //create calendar object for current day
      long currentTime = System.currentTimeMillis();
      Calendar now = Calendar.getInstance();
      now.setTimeInMillis(currentTime);
      //Get difference between years
      years = now.get(Calendar.YEAR) - birthDay.get(Calendar.YEAR);
      int currMonth = now.get(Calendar.MONTH) + 1;
      int birthMonth = birthDay.get(Calendar.MONTH) + 1;
      //Get difference between months
      months = currMonth - birthMonth;
      //if month difference is in negative then reduce years by one and calculate the number of months.
      if (months < 0)
      {
         years--;
         months = 12 - birthMonth + currMonth;
         if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
            months--;
      } else if (months == 0 && now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         years--;
         months = 11;
      }
      //Calculate the days
      if (now.get(Calendar.DATE) > birthDay.get(Calendar.DATE))
         days = now.get(Calendar.DATE) - birthDay.get(Calendar.DATE);
      else if (now.get(Calendar.DATE) < birthDay.get(Calendar.DATE))
      {
         int today = now.get(Calendar.DAY_OF_MONTH);
         now.add(Calendar.MONTH, -1);
         days = now.getActualMaximum(Calendar.DAY_OF_MONTH) - birthDay.get(Calendar.DAY_OF_MONTH) + today;
      } else
      {
         days = 0;
         if (months == 12)
         {
            years++;
            months = 0;
         }
      }
      //Create new Age object
      return new Age(days, months, years);
   }
   
	public int getEta(String string) throws java.text.ParseException {
		if((string==" ")||(string==null)){
			return 0;
		}
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
			Date daten = format.parse(string);
			return calculateAge(daten).getYears();		
	}
	
	
	public String getDate(){
		Date date = new Date();
		String string = new SimpleDateFormat("dd/MM/yyyy").format(date);
		return string;
	}
   
	
	public int getMesi(String string) throws java.text.ParseException {
		
if(string==" "){
	return 0;
}
		if(string!=null){
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
			Date daten = format.parse(string);
			return calculateAge(daten).getMonths();
		}
		return 0;
	}
	
	
    public String getRinnovo(double durata){
    	if(durata!=0.0){
    	double annirinnovo =(((durata/5)*2)/12);
    	annirinnovo=Math.nextUp(annirinnovo);
		String anniRinn =Double.toString(annirinnovo);
		String part1= anniRinn.substring(0,1);
		String part2= anniRinn.substring(2,3);
		String date = getDate();
		String days = date.substring(0, 2);
		int mesenow = Integer.parseInt(date.substring(3, 5));
		int annonow = Integer.parseInt(date.substring(6));
		int annorinnovo = Integer.parseInt(part1);
		String annitot= Integer.toString(annonow + annorinnovo);
		int meserinnovo = Integer.parseInt(part2);
		int mesetot=mesenow + meserinnovo;
		if(mesetot>12){
			mesetot=mesetot-12;
		}
		String mesitotstr= Integer.toString(mesetot);
		
		return days.concat("/").concat(mesitotstr).concat("/").concat(annitot);
    	}
    	return "";
	}
	
}