package EIT2;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int mesas[]=new int[9];
		int huecos[]=new int[9];
		int usuario;
		int cont=0;
		
		for(int i=0;i<huecos.length;i++) {
			huecos[i]=(int)(Math.random()*4);
		}
		
		for(int i=0;i<mesas.length;i++) {
			mesas[i]=i+1;
		}
		
		
		System.out.println("Numero de las mesas "+Arrays.toString(mesas));
		System.out.println();
		System.out.println("Personas sentadas "+Arrays.toString(huecos));
		
		do {
			
			cont=0;
		JOptionPane.showMessageDialog(null,"Bienvenido al restaurante Arrays e hijos");
		JOptionPane.showMessageDialog(null,"Si desea marcharse solo tiene que pulsar -1 en mi tablet");
		usuario=Integer.parseInt(JOptionPane.showInputDialog("cuantas personas sois?"));
		
		if(usuario==-1) {
			JOptionPane.showMessageDialog(null,"Siento que al final se vaya, que tenga un buen dia");
			System.exit(0);
		}
		
		for(int i=0;i<huecos.length;i++) {
			if(huecos[i]==0 &&cont==0 && usuario<=6 && usuario>=1) {
				JOptionPane.showMessageDialog(null,"Pueden sentarse en la mesa numero "+mesas[i]);
				
				huecos[i]=huecos[i]+usuario;
				cont++;
			}
			
			if(i==8) {
				for(int j=0;j<huecos.length;j++) {
					if(huecos[j]+usuario<=6 && cont==0 && usuario>=1) {
						JOptionPane.showMessageDialog(null,"Deberan compartir mesa en la mesa numero "+mesas[j]);
						huecos[j]=huecos[j]+usuario;
						cont++;
					}
					
					if(j==8 && huecos[j]+usuario>6 && cont==0 && usuario<=6 && usuario>=1) {
						JOptionPane.showMessageDialog(null,"Losiento no quedan mesas libre, vuelva otro dia");
					}
				}
			}
			
		}
		
		System.out.println("------------------------------------------------");
		System.out.println();
		System.out.println("Numero de las mesas "+Arrays.toString(mesas));
		System.out.println();
		System.out.println("Personas sentadas "+Arrays.toString(huecos));
		}while(usuario>=1 && usuario<=6);
		
		JOptionPane.showMessageDialog(null,"Me has dado un numero no valido, asi que fuera del restaurante ahora mismo");
	}
	

}
