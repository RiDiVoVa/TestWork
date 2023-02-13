import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;
import java.util.Map;




class  Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ArrayList<Trader> traders = new ArrayList<>();
        traders.add(new Trader("Slava","Golovin",15));
        traders.add(new Trader("Vasia","Sohin",12));
        traders.add(new Trader("Dima","Klymenko",11));

        String name = "root";
        String password = "12345";
        String URLconnection = "jdbc:mysql://localhost:3306/books";

//     TODO   Class.forName("com.mysql.jdbc.Driver"); не обязательно это вписфвать по скольку ты указываещь драйвер через path и ручная настройка не нужна

        try (Connection connection = DriverManager.getConnection(URLconnection, name, password)) {
            Statement statement = connection.createStatement();
//            statement.executeUpdate("ALTER table Traders change Experiens Experience Integer");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into traders");
//
//
//
//            for (Trader m : traders) {
//                Array namesss = connection.cre
//            }



//            for (Trader m: traders) {
//                statement.executeUpdate("insert traders(Name,Surename,Experience) values ('"m.getName()"'",m.getSureName(),m.getExperience())");
//
//            }




        }

    }
}
class Trader{
    private String name;
    private String sureName;
    private int experience;
    public Trader(String name,String sureName,int experience){
        this.name = name;
        this.sureName = sureName;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
