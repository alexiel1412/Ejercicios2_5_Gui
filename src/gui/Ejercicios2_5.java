package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicios2_5 extends JFrame {

	private JPanel contentPane;
	private JButton btnDesCent;
	private JButton btnCentral;
	private JButton btnHabCent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios2_5 frame = new Ejercicios2_5();
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
	public Ejercicios2_5() {
		setTitle("Botones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 423, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][][::10px,grow][][::10px,grow][][grow]", "[grow,fill][fill][grow]"));
		
		btnDesCent = new JButton("Deshabilitar Central");
		btnDesCent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				deshabilitarCentro(false, false, true);
			}
		});
		contentPane.add(btnDesCent, "cell 1 1,grow");
		
		btnCentral = new JButton("Central");
		btnCentral.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if (btnDesCent.isEnabled())
					deshabilitarCentro(false, true, false);
				else
					deshabilitarCentro(true, true, true);
			}
		});
		contentPane.add(btnCentral, "cell 3 1,grow");
		
		btnHabCent = new JButton("Habilitar Central");
		btnHabCent.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				deshabilitarCentro(true, true, false);
			}
		});
		btnHabCent.setEnabled(false);
		contentPane.add(btnHabCent, "cell 5 1,grow");
	}

	protected void deshabilitarCentro(boolean bt1, boolean bt2, boolean bt3)
	{
		this.btnDesCent.setEnabled(bt1);
		this.btnCentral.setEnabled(bt2);
		this.btnHabCent.setEnabled(bt3);
	}

}
