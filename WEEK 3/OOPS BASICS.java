// OOPS BASIC CONCEPT
class Human{//Blueprint or template for object
    //properties-attributes , methods - function
    //access specifiers- public,private,protected
  
    //properties-attributes
    int age;
    String nickname;
  
    //methods-function
    boolean hasMobile(boolean input,int k){//arguments-parameters
        return input;
    }
    int doubleage(){//int method
        return age*2;
    }
    void nickname(){//void method
        System.out.println("bose");
    }
    static String getInitial(){//static method
        return "R";
    }
}

// here static method is calling by Main.main
class Main {//this Main is class
    public static void main(String[] args) {//this main is function. Here,we add Block of code inside the curly brackets to this function
        Human pravin=new Human();//object created
        //object=instance of class-copy
        pravin.age=24;//here we are accessing properties of class Human
        System.out.println(pravin.age);
        boolean ans=pravin.hasMobile(true,44);//calling function
        System.out.println(ans);
        int doubleage=pravin.doubleage();//calling int method
        System.out.println(doubleage);
        pravin.nickname();//calling void method
        String s=Human.getInitial();///calling static method
        System.out.println(s);
    }
}
