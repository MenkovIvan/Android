package com.example.laba1;

public class intInText {
    public static String convert(int number, String str){
        if (number==0){
            return str+"ноль ";
        }
        else if (number==1){
            return str+"один ";
        }
        else if (number==2){
            return str+"два ";
        }
        else if (number==3){
            return str+"три ";
        }
        else if (number==4){
            return str+"четыре ";
        }
        else if (number==5){
            return str+"пять ";
        }
        else if (number==6){
            return str+"шесть ";
        }
        else if (number==7){
            return str+"семь ";
        }
        else if (number==8){
            return str+"восемь ";
        }
        else if (number==9){
            return str+"девять ";
        }
        else if (number==10){
            return str+"десять ";
        }
        else if (number==11){
            return str+"одиннадцать ";
        }
        else if (number==12){
            return str+"двенадцать ";
        }
        else if (number==13){
            return str+"тринадцать ";
        }
        else if (number==14){
            return str+"четырнадцать ";
        }
        else if (number==15){
            return str+"пятнадцать ";
        }
        else if (number==16){
            return str+"шестнадцать ";
        }
        else if (number==17){
            return str+"семнадцать ";
        }
        else if (number==18){
            return str+"восемнадцать ";
        }
        else if (number==19){
            return str+"девятнадцать ";
        }
        else if ((number>=20)&&(number<=29)){
            return str+"двадцать "+convert(number%10,str);
        }
        else if ((number>=30)&&(number<=39)){
            return str+"тридцать "+convert(number%10,str);
        }
        else if ((number>=40)&&(number<=49)){
            return str+"сорок "+convert(number%10,str);
        }
        else if ((number>=50)&&(number<=59)){
            return str+"пятьдесят "+convert(number%10,str);
        }
        else if ((number>=60)&&(number<=69)){
            return str+"шестьдесят "+convert(number%10,str);
        }
        else if ((number>=70)&&(number<=79)){
            return str+"семьдесят "+convert(number%10,str);
        }
        else if ((number>=80)&&(number<=89)){
            return str+"восемьдесят "+convert(number%10,str);
        }
        else if ((number>=90)&&(number<=99)){
            return str+"девяносто "+convert(number%10,str);
        }
        else if ((number>=100)&&(number<=199)){
            return str+"сто "+convert(number%100,str);
        }
        else if ((number>=200)&&(number<=299)){
            return str+"двести "+convert(number%100,str);
        }
        else if ((number>=300)&&(number<=399)){
            return str+"триста "+convert(number%100,str);
        }
        else if ((number>=400)&&(number<=499)){
            return str+"четыреста "+convert(number%100,str);
        }
        else if ((number>=500)&&(number<=599)){
            return str+"пятьсот "+convert(number%100,str);
        }
        else if ((number>=600)&&(number<=699)){
            return str+"шестьсот "+convert(number%100,str);
        }
        else if ((number>=700)&&(number<=799)){
            return str+"семьсот "+convert(number%100,str);
        }
        else if ((number>=800)&&(number<=899)){
            return str+"восемьсот "+convert(number%100,str);
        }
        else if ((number>=900)&&(number<=999)){
            return str+"девятьсот "+convert(number%100,str);
        }
        else if ((number>=1000) && (number<=999999)){
            if (((number/1000)%10==1)&&((number/1000)%100!=11)){
                return str+convert((number/10000)*10,str+"одна тысяча "+convert(number%1000,str));
            }
            else if (((number/1000)%10==2)&&((number/1000)%100!=12)){
                return str+convert((number/10000)*10,str+"две тысячи "+convert(number%1000,str));
            }
            else if (((number/1000)%10==3)&&((number/1000)%100!=13)){
                return str+convert((number/10000)*10,str+"три тысячи "+convert(number%1000,str));
            }
            else if (((number/1000)%10==4)&&((number/1000)%100!=14)){
                return str+convert((number/10000)*10,str+"четыре тысячи "+convert(number%1000,str));
            }
            else
                return str+convert(number/1000,str+"тысяч "+convert(number%1000,str));
        }
        else if (number==1000000){
            return "один миллион";
        }
        else return "ERROR";
    }
}