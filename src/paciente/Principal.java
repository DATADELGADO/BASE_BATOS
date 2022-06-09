package paciente;

public class Principal {

    public static void main(String[] args) {

        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n", "DNI", "NOMBRE", "PATERNO", "MATERNO", "TELEFONO", "CORREO", "DIRECCION", "EDAD", "ESTATURA", "ISCASADO", "SEXO");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n", "---", "------", "-------", "-------", "--------", "------", "---------", "----", "--------", "--------", "----");

        //CREAR UN OBJETO DE TIPO PACIENTE
        Paciente Luis = new Paciente();
        Luis.setDni("1111111");
        Luis.setNombre("luis");
        Luis.setPaterno("ruiz");
        Luis.setMaterno("roncal");
        Luis.setCorreo("luis@gmail.com");
        Luis.setTelefono("62584251");
        Luis.setDireccion("Av. ejercito 123");
        Luis.setEdad(34);
        Luis.setEstatura(1.72);
        Luis.setSexo('h');
        Luis.setIsCasado(true);
        //Luis.mostrar();

        Paciente carla = new Paciente("2222222",
                "Carla",
                "Lezcano",
                "Rodriguez",
                "65842544",
                "miguel@gmail.com",
                "calle sagra 29",
                24,
                1.75,
                false,
                'M'
        );
        //miguel.mostrar();

        Paciente maria = new Paciente("3333333", "Maria", "Vazquez", "Ledesma");
        maria.setEdad(17);
        maria.setEstatura(1.76);

        //maria.mostrar();
        //Luis.mostrarMayoresEdad();
        // carla.mostrarMayoresEdad();
        //maria.mostrarMayoresEdad();
        Luis.mostrarMayoresEstatura();
        carla.mostrarMayoresEstatura();
        maria.mostrarMayoresEstatura();

    }

}
