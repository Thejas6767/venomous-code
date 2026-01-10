class University{
public static void main(String [] args){
int numberOfStudents=3007;
int classRooms=34;
int faculty=23;
int buses=3;
int [] Collage={numberOfStudents,classRooms,faculty,buses};
int courses=5;
Collage[1]=courses;


for(int value=0;value<Collage.length;value++){
	int number=Collage[value];
System.out.println(number);

}
}
}