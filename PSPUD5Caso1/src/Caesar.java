public class Caesar
{
	private String mensaje;
	private String mensaje2;
	private String mensaje3;
	private int offset=3;
	// método para encriptar
	private String encriptar()
	{
		String temp = "abcdefghijklmnopqrstuvwxyz ";
		String translate = new String();
		for (int i = 0; i < mensaje.length(); i++)
		{
			String t = Character.toString(mensaje.charAt(i));
			if(t.equals(" ")) {
				translate += " ";
			} else {
				int index = temp.indexOf(t);
				index = (index+offset) % 27;
				String add = Character.toString(temp.charAt(index));
				translate += add;
		}
		}
		return translate;
	}
	// método para desencriptar.
	private String desencriptar()
	{
		//creamos un string temporal
		String temp = "abcdefghijklmnopqrstuvwxyz ";
		//se crea el StringBuilder llamado cifrado
		 StringBuilder cifrado = new StringBuilder();
		 //utilizaremos este String para generar el nuevo codigo
		 String translate = new String();
		 //bucle for para recorrer el mensaje que nos llega
		 for (int i = 0; i < mensaje2.length(); i++)
			{
			 //damos al caracter t el valor del char i
				String t = Character.toString(mensaje2.charAt(i));
				//si el character es un espacio, se queda como un espacio
				if(t.equals(" ")) {
					translate += " ";
				} else {
					//si no es un espacio se le da el valor que corresponde
					int index = temp.indexOf(t);
					index = (index-offset) % 27;
					String less = Character.toString(temp.charAt(index));
					translate += less;
				}
			}
		return translate;
	}
	public static void main(String[] args)
	{
		String encriptado;
		String desencriptado;
		Caesar Crip = new Caesar();
		Crip.mensaje="cesur centro de formacion";
		Crip.offset=3;
		encriptado=Crip.encriptar();
		Crip.mensaje2=encriptado;
		System.out.println(Crip.mensaje2);
		desencriptado=Crip.desencriptar();
		Crip.mensaje3=desencriptado;
		System.out.println(Crip.mensaje3);
	}
}
