class PgRunner{

public static void main(String [] args){
 
int [] roomNumbers = {101,202,303,404};


Pg.pgFloors(roomNumbers);
System.out.println("I am staying in Room  "+roomNumbers[1]);


}
}