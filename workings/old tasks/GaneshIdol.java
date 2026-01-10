class GaneshIdol{
public static int price(String itemName){
int amount =0;

if(itemName =="quatity"){
  amount =2500;
  System.out.println("ganesh festival"+amount);

}else if(false){
	
	System.out.println("not available");
}else{
	
	System.out.println("available in cost of 25000 rupees ganesh");
}


return amount;

}

    public static int smallIdol(String type) {
        int amount = 0;
        if (type =="clay") {
            amount = 1000;
            System.out.println("Small clay idol price = " + amount);
        } else if (type =="eco") {
            amount = 1200;
            System.out.println("Small eco-friendly idol price = " + amount);
        } else {
            amount = 1500;
            System.out.println("Other small idol price = " + amount);
        }
        return amount;
    }

    public static int mediumIdol(String type) {
        int amount = 0;
        if (type=="clay") {
            amount = 2000;
            System.out.println("Medium clay idol price = " + amount);
        } else if (type=="eco") {
            amount = 2500;
            System.out.println("Medium eco-friendly idol price = " + amount);
        } else {
            amount = 3000;
            System.out.println("Other medium idol price = " + amount);
        }
        return amount;
    }

    public static int bigIdol(String type) {
        int amount = 0;
        if (type=="clay") {
            amount = 4000;
            System.out.println("Big clay idol price = " + amount);
        } else if (type=="eco") {
            amount = 4500;
            System.out.println("Big eco-friendly idol price = " + amount);
        } else {
            amount = 5000;
            System.out.println("Other big idol price = " + amount);
        }
        return amount;
    }

    public static int marbleIdol(String quality) {
        int amount = 0;
        if (quality =="normal") {
            amount = 7000;
            System.out.println("Normal marble idol price = " + amount);
        } else if (quality =="premium") {
            amount = 9000;
            System.out.println("Premium marble idol price = " + amount);
        } else {
            amount = 10000;
            System.out.println("Other marble idol price = " + amount);
        }
        return amount;
    }

    public static int bronzeIdol(String size) {
        int amount = 0;
        if (size =="small") {
            amount = 8000;
            System.out.println("Small bronze idol price = " + amount);
        } else if (size =="big") {
            amount = 12000;
            System.out.println("Big bronze idol price = " + amount);
        } else {
            amount = 10000;
            System.out.println("Other bronze idol price = " + amount);
        }
        return amount;
    }

    public static int silverIdol(String design) {
        int amount = 0;
        if (design=="simple") {
            amount = 13000;
            System.out.println("Simple silver idol price = " + amount);
        } else if (design=="fancy") {
            amount = 15000;
            System.out.println("Fancy silver idol price = " + amount);
        } else {
            amount = 14000;
            System.out.println("Other silver idol price = " + amount);
        }
        return amount;
    }

    public static int goldIdol(String design) {
        int amount = 0;
        if (design =="simple") {
            amount = 45000;
            System.out.println("Simple gold idol price = " + amount);
        } else if (design =="fancy") {
            amount = 50000;
            System.out.println("Fancy gold idol price = " + amount);
        } else {
            amount = 48000;
            System.out.println("Other gold idol price = " + amount);
        }
        return amount;
    }

    public static int diamondIdol(String cut) {
        int amount = 0;
        if (cut =="small") {
            amount = 90000;
            System.out.println("Small diamond idol price = " + amount);
        } else if (cut =="big") {
            amount = 100000;
            System.out.println("Big diamond idol price = " + amount);
        } else {
            amount = 95000;
            System.out.println("Other diamond idol price = " + amount);
        }
        return amount;
    }

    public static int ecoIdol(String color) {
        int amount = 0;
        if (color =="green") {
            amount = 2000;
            System.out.println("Eco idol (green) price = " + amount);
        } else if (color.equals("white")) {
            amount = 2200;
            System.out.println("Eco idol (white) price = " + amount);
        } else {
            amount = 2500;
            System.out.println("Other eco idol price = " + amount);
        }
        return amount;
    }

    public static int clayIdol(String color) {
        int amount = 0;
        if (color =="red") {
            amount = 1500;
            System.out.println("Clay idol (red) price = " + amount);
        } else if (color =="yellow") {
            amount = 1800;
            System.out.println("Clay idol (yellow) price = " + amount);
        } else {
            amount = 2000;
            System.out.println("Other clay idol price = " + amount);
        }
        return amount;
    }

    
}