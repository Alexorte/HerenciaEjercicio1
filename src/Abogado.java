public class Abogado extends Empleado{
    @Override
    public int getVacaciones() {
        return super.getVacaciones() / 2;
    }
    @Override
    public double getSalario(){
        return super.getSalario()+10000;
    }
    @Override
    public int getHoras() {
        return super.getHoras()+5;
    }
    @Override
    public String getMesVacaciones() {
        return "julio";
}

    public void mostrar(){
        System.out.println("estoy haciendo fotocopias");
    }
}
