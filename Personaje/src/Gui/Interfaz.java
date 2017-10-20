package Gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.AbstractListModel;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ListSelectionModel;
import javax.swing.border.BevelBorder;

public class Interfaz extends JFrame {

	private JPanel contentPane;
	private JTextField txtCatlogoDePersonajes;
	private final Action action = new SwingAction();
	private JList list;
	private JTextField txtSeleccioneElPersonaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSeleccionar = new JButton("SELECCIONAR");
		btnSeleccionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "SELECCIONADO");
				
			}
		});
		btnSeleccionar.setAction(action);
		btnSeleccionar.setBounds(159, 212, 127, 23);
		contentPane.add(btnSeleccionar);
		
		txtCatlogoDePersonajes = new JTextField();
		txtCatlogoDePersonajes.setEditable(false);
		txtCatlogoDePersonajes.setBackground(new Color(51, 204, 204));
		txtCatlogoDePersonajes.setFont(new Font("Showcard Gothic", Font.PLAIN, 18));
		txtCatlogoDePersonajes.setText("CAT\u00C1LOGO DE PERSONAJES");
		txtCatlogoDePersonajes.setBounds(93, 0, 242, 38);
		contentPane.add(txtCatlogoDePersonajes);
		txtCatlogoDePersonajes.setColumns(10);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"    ORCO", "    HUMANO", "     HOBBIT", "     MAGO"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setBounds(179, 86, 64, 69);
		contentPane.add(list);
		
		txtSeleccioneElPersonaje = new JTextField();
		txtSeleccioneElPersonaje.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSeleccioneElPersonaje.setEditable(false);
		txtSeleccioneElPersonaje.setText("Seleccione el personaje que desea crear:");
		txtSeleccioneElPersonaje.setBounds(103, 49, 232, 26);
		contentPane.add(txtSeleccioneElPersonaje);
		txtSeleccioneElPersonaje.setColumns(10);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SELECCIONAR");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
