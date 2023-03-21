export class Person{
    private name:String;
    public location:String;
    readonly id:number;

    constructor(n: String,l: String,i:number){
        this.name=n;
        this.location=l;
        this.id=i;
    }

    display(){
        // this.name="sahil";
        // this.id=09876;
        console.log(this.name+" "+this.location+" "+this.id);
    }
}
const p = new Person("jimit","Ahmedabad",158427);
//d.id=239502;
p.display();

const p2 = new Person("sahil","vadodara",927);

p2.display();