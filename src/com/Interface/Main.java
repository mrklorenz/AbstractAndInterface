package com.Interface;

//ANSWER FOR PROBLEM 1
interface Fowls {
    String getNeededNumber(int num);
}

class Cocks implements Fowls{
    @Override
    public String getNeededNumber(int num) {
        return "We can have " + num + " number of Cocks";
    }
}

class Hens implements Fowls{
    @Override
    public String getNeededNumber(int num) {
        return "We can have " + num + " number of Hens";
    }
}

class Chickens implements Fowls{
    @Override
    public String getNeededNumber(int num) {
        return "We can have " + num + " number of Chickens";
    }
}

class Main {
    public static void main(String args[]){
        Cocks cock = new Cocks();
        Hens hen = new Hens();
        Chickens chicken = new Chickens();

        for(int i=0;i<=20;i++)
        {
            for(int j=1;j<=34;j++)
            {
                for(int k=1;k<=334;k++)
                {
                    if(5*i+3*j+k==100)
                    {
                        if(i+j+3*k==100 && i!=0)
                        {
                            System.out.println("Possible answer: ");
                            System.out.println(cock.getNeededNumber(i));
                            System.out.println(hen.getNeededNumber(j));
                            System.out.println(chicken.getNeededNumber(3*k));
                            System.out.println("");
                        }
                    }
                }
            }
        }
    }
}
