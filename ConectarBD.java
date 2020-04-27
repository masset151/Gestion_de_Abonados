public class ConectarBD {
	static String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	static String dbname = "carreraoficial";
	static String url="jdbc:mysql://localhost:3307/"+dbname+timezone;
	static String user="root";
	static String pas = "manolo";
	static String driver="com.mysql.cj.jdbc.Driver";


	static Connection conexion;
	static Statement consulta;
	static ResultSet resultado;

	protected static void Conectar() {
		try {
			Class.forName(driver);
			conexion = DriverManager.getConnection(url,user,pas);
			consulta = conexion.createStatement();
			System.out.println("conectado");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	protected static ResultSet ejecutarUpdate(String sentencia) {

		try {
			 consulta.executeUpdate(sentencia);
		}catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return resultado;
	}

	protected static ResultSet EjecutarSentencia(String sentencia) {
		
		try {
			resultado = consulta.executeQuery(sentencia);
		}catch (Exception e) {
			System.out.println(e.getMessage());

		}

		return resultado;
	}
	


}
