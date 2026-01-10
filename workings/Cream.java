class Cream{
public String creamFlavour;
public Ice ice;

public Cream(Ice ice){
this.creamFlavour=ice.iceCubes;	
this.ice=ice;
}
public void displayCream(){
ice.iceDetails();
}
}

