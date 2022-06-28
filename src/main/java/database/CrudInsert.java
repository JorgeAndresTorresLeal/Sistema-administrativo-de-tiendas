package database;

import java.sql.*;

public class CrudInsert {


    private Connection conexionDb ;

    public CrudInsert(Connection conexionDb) {
        this.conexionDb = conexionDb;
    }

    public void insertarPr(String name, float cantidad, String fechaVencimiento, float preciov, float precioc){
        String sql = "INSERT INTO public.productos(\n" +
                "\t name, cantidad, precio, vencimiento, precioc)\n" +
                "\tVALUES ( ?, ?, ?, ?, ?);";

        try{
            PreparedStatement statement = this.conexionDb.prepareStatement(sql);
            statement.setString(1,name);
            statement.setFloat(2,cantidad);
            statement.setFloat(3,preciov);
            statement.setDate(4,Date.valueOf(fechaVencimiento));
            statement.setFloat(5, precioc);
            int rowInsertd = statement.executeUpdate();
            System.out.println((rowInsertd>0)?"inserccion exitosa!":"inserccion fallida!");
        }catch (SQLException e){
            System.out.println("error al conectarse: "+e);
        }
    }

    public void insertarUs(int documento, String user, String pass, String name, boolean bool){
        try {
            String sql ="INSERT INTO public.usuarios(\n" +
                    "\tid, usuario, password, name, jefe)\n" +
                    "\tVALUES (?, ?, ?, ?, ?);";
            PreparedStatement statement = conexionDb.prepareStatement(sql);
            statement.setInt(1,documento);
            statement.setString(2,user);
            statement.setString(3,pass);
            statement.setString(4,name);
            statement.setBoolean(5, bool);
            int rowInserted=statement.executeUpdate();
            System.out.println((rowInserted>0)?"inserccion exitosa!":"inserccion fallida!");
        }catch (SQLException e){
            System.out.println(e);
        }

    }


}
