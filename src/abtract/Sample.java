package abtract;

public abstract class Sample {

    public void a(){
        System.out.println(" a() ");
    }

    public void b(){
        System.out.println(" b() ");
    }

    abstract void c();

    abstract void d();

    public void launcher(){

        this.a();
        this.b();
        this.c();
        this.d();
    }
}
class Runner extends Sample{

    @Override
    void c() {
        System.out.println( " c() ");
    }

    @Override
    void d() {
        System.out.println(" d() ");
    }
}

