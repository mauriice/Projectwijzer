import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
   
public class Projectwijzer extends JFrame {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public static void main( String args[] ) {
    JFrame frame = new Projectwijzer();
    frame.setSize( 450, 200 );
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    frame.setTitle( "Oefening 0601 " );
    frame.setContentPane( new Paneel() );
    frame.setVisible( true );
  }
}

class Paneel extends JPanel {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private JLabel label;
  private JTextField invoerVak, invoerVak2;
  private Datum datum;
  
  public Paneel() {
    setBackground( Color.BLACK );
    setForeground(Color.WHITE);
    
    datum = new Datum();

    label = new JLabel( "Voer dag in" );
    invoerVak = new JTextField( 5 );
    invoerVak.addActionListener( new InvoerVakHandler() );
    invoerVak2.addActionListener(new InvoerVakHandler2());
    
    add( label );
    add( invoerVak );
    add(invoerVak2);
  }
  
  public void paintComponent( Graphics g ) {
    super.paintComponent( g );
    g.drawString( String.format( "De ingevoerde datum is %02d-", datum.getDag() ) + 
                  String.format( "%02d-", datum.getMaand() ) + 
                  String.format( "%04d", datum.getJaar() ), 50, 100 );
  }
  
  abstract class InvoerVakHandler2 implements ActionListener
  {
	private boolean dagIngevoerd, maandIngevoerd;	
    public void actionPerformed (ActionEvent 2)
  {
	  string invoer = invoerVak2.getText();
	  int getal = Integer.parseInt(invoer);
	  
	  invoerVak2.setText("");
	  if(!dagIngevoerd)
	  {
		  datum.setDag(getal);
		  dagIngevoerd = true;
		  label.setText("Voer maand in");
	  }
	  else
		  if(!maandIngevoerd)
		  {
			  datum.setMaand(getal);
			  maandIngevoerd = true;
			  label.setText("Voer jaar in");
		  }
		  else
		  {
			  datum.setJaar(getal);
			  label.setText("Voer dag in");
			  dagIngevoerd = false;
			  maandIngevoerd = false;
			  repaint();
		  }
  

  class InvoerVakHandler implements ActionListener {
    private boolean dagIngevoerd, maandIngevoerd;       
    
    public void actionPerformed( ActionEvent e ) {
      String invoer = invoerVak.getText();
      int getal = Integer.parseInt( invoer );
      
      invoerVak.setText( "" );
      if( !dagIngevoerd ) {
        datum.setDag( getal );
        dagIngevoerd = true;
        label.setText( "Voer maand in" );
      }
      else
      if( !maandIngevoerd ) {
        datum.setMaand( getal );
        maandIngevoerd = true;
        label.setText( "Voer jaar in" );
      }
      else {
        datum.setJaar( getal );    
        label.setText( "Voer dag in" );
        dagIngevoerd = false;
        maandIngevoerd = false;
        repaint();
      }
    }
  


 class Datum {
  // Attributen
  private int dag;
  private int maand;
  private int jaar;
  
 
  // Getters
  public int getDag() {
    return dag;
  }

  public int getMaand() {
    return maand;
  }

  public int getJaar() {
    return jaar;
  }
    
  // Setters
  public void setDag( int dag ) {
    this.dag = dag;
  }

  public void setMaand( int maand ) {
    this.maand = maand;
  }

  public void setJaar( int jaar ) {
    this.jaar = jaar;
  }
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub	
	}