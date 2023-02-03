import jdk.jfr.Description;

import java.sql.*;
import java.util.ArrayList;

public class SubTask4ForTask5 {
    public static void main(String[] args) {

        String name = "root";
        String password = "12345";
        String URLconnection = "jdbc:mysql://localhost:3306/myStore";
        try(Connection connection = DriverManager.getConnection(URLconnection,name,password)) {
//            Statement statement = connection.createStatement();
//            statement.executeUpdate("create table Orders (id integer not null auto_increment,GoodsInOrder varchar(20) not null , DateComing date not null,primary key (id))");
//            statement.executeUpdate("create table OrderedGoods (id integer not null auto_increment,Goods varchar(20) not null ,Amount integer not null ,primary key (id))");
//            statement.executeUpdate("create table Goods (id integer not null auto_increment,Goods varchar(20) not null ,Description varchar (100) not null ,Price integer not null ,primary key (id))");

            System.out.println("good");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
class Goods{
    String name;
    String description;
    int price;
    public Goods(String name,String description,int price){
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public int getPrice() {
        return price;
    }

}
//    ArrayList<Goods> goods = new ArrayList<>();
//            goods.add(new Goods("Iphone","good phone",26));
//                    goods.add(new Goods("Samsung","norm phone",26));
//                    goods.add(new Goods("Huawei","shit phone",15));
// for (Goods n: goods) {
//                String sql = "INSERT INTO Goods (Goods,Description,Price) VALUES (?,?,?)";
//                PreparedStatement cmd = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//                cmd.setString(1,n.name);
//                cmd.setString(2,n.description);
//                cmd.setInt(3,n.price);
//                if (cmd.executeUpdate()==1){
//                    ResultSet keys = cmd.getGeneratedKeys();
//                    keys.next();
//                    int key = keys.getInt(1);
//                }
//            }

//            for (Goods n: goods) {
//                String sql = "INSERT INTO OrderedGoods (Goods,Amount) VALUES (?,?)";
//                PreparedStatement cmd = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
//                cmd.setString(1,n.name);
//                cmd.setInt(2,n.amount);
//                if (cmd.executeUpdate()==1){
//                    ResultSet keys = cmd.getGeneratedKeys();
//                    keys.next();
//                    int key = keys.getInt(1);
//                }
//            }

