package petsiter;



public class dog {

    //atributtes
    private String name;
    private double age;
    private int happiness, cleaniness, fullness, inteligence, health, price, food_amount;
    private boolean die = false;

    //getter-setter
    public boolean isDie(){
        return die;
    }
    public String getName(){
        return name;
    }
    public double getAge(){
        return age;
    }
    public int getHappiness(){
        return happiness;
    }
    public int getCleaniness(){
        return cleaniness;
    }
    public int getFullness(){
        return fullness;
    }
    public int getHealth(){
        return health;
    }
    public int getInteligence(){
        return inteligence;
    }
    public int getPrice(){
        return price;
    }
    public int getFoodAmount(){
        return food_amount;
    }

    public void setName(String name){
        this.name = name;
    }
    

    // methods
    public void play(){
        happiness +=2;
        cleaniness -=2;
        fullness -=1;
        if (happiness > 5) happiness = 5;
        if (cleaniness < 0) cleaniness = 0;
        if (fullness < 0) fullness = 0; 
        if (fullness < 3 || cleaniness < 2) health -=1;
        if (health <= 0) die = true;
    }
    public void bath(){
        cleaniness = 5;
        happiness -= 3;
        if (happiness < 0) happiness = 0;
    }
    public void train(){
        happiness -=2;
        inteligence +=1;
        fullness -=1;
        if (happiness < 0) happiness = 0;
        if (fullness < 0) fullness = 0;
        if (inteligence > 100) inteligence = 100;
        if (inteligence % 10 == 0){
            price = price + (int)(0.1*price);
        }
        if (fullness < 3) health -=1;
        if (health <= 0) die = true;
    }
    public void sleep(){
        fullness -=1;
        health +=1;
        age += 0.5;
        if (fullness < 0) fullness = 0;
        if (health > 5) health = 5;
        if (age > 7) price = price - (int)(0.5*price);
        else if (age > 3) price = price - (int)(0.25*price);
        if (fullness < 3) health -=1;
        if (health <= 0) die = true;

    }
    public int eat(){
        fullness = 5;
        return food_amount;
    }


    //constructor
    public dog(){
        happiness = 3;
        cleaniness = 3;
        fullness = 3;
        health = 3;
        price = 50;
        food_amount = 10;
    }

    public dog(String name){
        this.name = name;
        happiness = 3;
        cleaniness = 3;
        fullness = 3;
        health = 3;
        price = 50;
        food_amount = 10;
    }

}
