package Core;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextArea;

public class Window {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_22;
	private JPanel panel_1;
	private JLabel lblCazasLigeros;
	private JLabel lblCazasPesados;
	private JLabel lblCruceros;
	private JLabel lblNavesBatalla;
	private JLabel lblAcorazados;
	private JLabel lblBombarderos;
	private JLabel lblDestructores;
	private JLabel lblEstrellas;
	private JLabel lblNpc;
	private JLabel lblNgc;
	private JLabel lblReciclas;
	private JPanel panel_2;
	private JPanel panel_3;
	private JTextField textField_1;
	private JLabel label;
	private JTextField textField_2;
	private JLabel label_1;
	private JTextField textField_3;
	private JLabel label_2;
	private JTextField textField_4;
	private JLabel label_3;
	private JTextField textField_5;
	private JLabel label_4;
	private JTextField textField_6;
	private JLabel label_5;
	private JTextField textField_7;
	private JLabel label_6;
	private JTextField textField_8;
	private JLabel label_7;
	private JTextField textField_10;
	private JLabel label_8;
	private JTextField textField_20;
	private JLabel label_9;
	private JTextField textField_21;
	private JLabel label_10;
	private JPanel panel_4;
	private JPanel panel_5;
	private JButton btnCalcular;
	private JPanel panel_6;
	private JLabel lblGanancias;
	private JPanel panel_7;
	private JLabel lblNewLabel;
	private JLabel lblPerdidasAtacante;
	private JLabel lblPerdidasAtacante_1;
	private JLabel lblMetal;
	private JLabel lblNewLabel_2;
	private JLabel lblReciclado;
	private JTextField textField_13;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 898, 699);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 86, 86, 0 };
		gbl_panel.rowHeights = new int[] { 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		textField = new JTextField();
		textField.setText("0");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);

		lblCazasLigeros = new JLabel("CAZAS LIGEROS");
		GridBagConstraints gbc_lblCazasLigeros = new GridBagConstraints();
		gbc_lblCazasLigeros.insets = new Insets(0, 0, 5, 0);
		gbc_lblCazasLigeros.gridx = 1;
		gbc_lblCazasLigeros.gridy = 0;
		panel.add(lblCazasLigeros, gbc_lblCazasLigeros);

		textField_14 = new JTextField();
		textField_14.setText("0");
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 0;
		gbc_textField_14.gridy = 1;
		panel.add(textField_14, gbc_textField_14);
		textField_14.setColumns(10);

		lblCazasPesados = new JLabel("CAZAS PESADOS");
		GridBagConstraints gbc_lblCazasPesados = new GridBagConstraints();
		gbc_lblCazasPesados.insets = new Insets(0, 0, 5, 0);
		gbc_lblCazasPesados.gridx = 1;
		gbc_lblCazasPesados.gridy = 1;
		panel.add(lblCazasPesados, gbc_lblCazasPesados);

		textField_15 = new JTextField();
		textField_15.setText("0");
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 0;
		gbc_textField_15.gridy = 2;
		panel.add(textField_15, gbc_textField_15);
		textField_15.setColumns(10);

		lblCruceros = new JLabel("CRUCEROS");
		GridBagConstraints gbc_lblCruceros = new GridBagConstraints();
		gbc_lblCruceros.insets = new Insets(0, 0, 5, 0);
		gbc_lblCruceros.gridx = 1;
		gbc_lblCruceros.gridy = 2;
		panel.add(lblCruceros, gbc_lblCruceros);

		textField_16 = new JTextField();
		textField_16.setText("0");
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 0;
		gbc_textField_16.gridy = 3;
		panel.add(textField_16, gbc_textField_16);
		textField_16.setColumns(10);

		lblNavesBatalla = new JLabel("NAVES BATALLA");
		GridBagConstraints gbc_lblNavesBatalla = new GridBagConstraints();
		gbc_lblNavesBatalla.insets = new Insets(0, 0, 5, 0);
		gbc_lblNavesBatalla.gridx = 1;
		gbc_lblNavesBatalla.gridy = 3;
		panel.add(lblNavesBatalla, gbc_lblNavesBatalla);

		textField_17 = new JTextField();
		textField_17.setText("0");
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 0;
		gbc_textField_17.gridy = 4;
		panel.add(textField_17, gbc_textField_17);
		textField_17.setColumns(10);

		lblAcorazados = new JLabel("ACORAZADOS");
		GridBagConstraints gbc_lblAcorazados = new GridBagConstraints();
		gbc_lblAcorazados.insets = new Insets(0, 0, 5, 0);
		gbc_lblAcorazados.gridx = 1;
		gbc_lblAcorazados.gridy = 4;
		panel.add(lblAcorazados, gbc_lblAcorazados);

		textField_19 = new JTextField();
		textField_19.setText("0");
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 0;
		gbc_textField_19.gridy = 5;
		panel.add(textField_19, gbc_textField_19);
		textField_19.setColumns(10);

		lblBombarderos = new JLabel("BOMBARDEROS");
		GridBagConstraints gbc_lblBombarderos = new GridBagConstraints();
		gbc_lblBombarderos.insets = new Insets(0, 0, 5, 0);
		gbc_lblBombarderos.gridx = 1;
		gbc_lblBombarderos.gridy = 5;
		panel.add(lblBombarderos, gbc_lblBombarderos);

		textField_22 = new JTextField();
		textField_22.setText("0");
		GridBagConstraints gbc_textField_22 = new GridBagConstraints();
		gbc_textField_22.insets = new Insets(0, 0, 5, 5);
		gbc_textField_22.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_22.gridx = 0;
		gbc_textField_22.gridy = 6;
		panel.add(textField_22, gbc_textField_22);
		textField_22.setColumns(10);

		lblDestructores = new JLabel("DESTRUCTORES");
		GridBagConstraints gbc_lblDestructores = new GridBagConstraints();
		gbc_lblDestructores.insets = new Insets(0, 0, 5, 0);
		gbc_lblDestructores.gridx = 1;
		gbc_lblDestructores.gridy = 6;
		panel.add(lblDestructores, gbc_lblDestructores);

		textField_18 = new JTextField();
		textField_18.setText("0");
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 0;
		gbc_textField_18.gridy = 7;
		panel.add(textField_18, gbc_textField_18);
		textField_18.setColumns(10);

		lblEstrellas = new JLabel("ESTRELLAS");
		GridBagConstraints gbc_lblEstrellas = new GridBagConstraints();
		gbc_lblEstrellas.insets = new Insets(0, 0, 5, 0);
		gbc_lblEstrellas.gridx = 1;
		gbc_lblEstrellas.gridy = 7;
		panel.add(lblEstrellas, gbc_lblEstrellas);

		textField_11 = new JTextField();
		textField_11.setText("0");
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 0;
		gbc_textField_11.gridy = 8;
		panel.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);

		lblNpc = new JLabel("NPC");
		GridBagConstraints gbc_lblNpc = new GridBagConstraints();
		gbc_lblNpc.insets = new Insets(0, 0, 5, 0);
		gbc_lblNpc.gridx = 1;
		gbc_lblNpc.gridy = 8;
		panel.add(lblNpc, gbc_lblNpc);

		textField_12 = new JTextField();
		textField_12.setText("0");
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 0;
		gbc_textField_12.gridy = 9;
		panel.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);

		lblNgc = new JLabel("NGC");
		GridBagConstraints gbc_lblNgc = new GridBagConstraints();
		gbc_lblNgc.insets = new Insets(0, 0, 5, 0);
		gbc_lblNgc.gridx = 1;
		gbc_lblNgc.gridy = 9;
		panel.add(lblNgc, gbc_lblNgc);

		textField_9 = new JTextField();
		textField_9.setText("0");
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 0;
		gbc_textField_9.gridy = 10;
		panel.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);

		lblReciclas = new JLabel("RECICLAS");
		GridBagConstraints gbc_lblReciclas = new GridBagConstraints();
		gbc_lblReciclas.insets = new Insets(0, 0, 5, 0);
		gbc_lblReciclas.gridx = 1;
		gbc_lblReciclas.gridy = 10;
		panel.add(lblReciclas, gbc_lblReciclas);

		panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);

		lblPerdidasAtacante = new JLabel("PERDIDAS ATACANTE 1");

		lblPerdidasAtacante_1 = new JLabel("PERDIDAS ATACANTE 2");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addGap(34).addComponent(lblPerdidasAtacante).addGap(46)
						.addComponent(lblPerdidasAtacante_1).addContainerGap(916, Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap()
						.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblPerdidasAtacante_1)
								.addComponent(lblPerdidasAtacante))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new BorderLayout(0, 0));

		panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.WEST);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[] { 86, 86, 0 };
		gbl_panel_3.rowHeights = new int[] { 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel_3.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel_3.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, Double.MIN_VALUE };
		panel_3.setLayout(gbl_panel_3);

		textField_1 = new JTextField();
		textField_1.setText("0");
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 0;
		gbc_textField_1.gridy = 0;
		panel_3.add(textField_1, gbc_textField_1);

		label = new JLabel("CAZAS LIGEROS");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 5, 0);
		gbc_label.gridx = 1;
		gbc_label.gridy = 0;
		panel_3.add(label, gbc_label);

		textField_2 = new JTextField();
		textField_2.setText("0");
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.gridx = 0;
		gbc_textField_2.gridy = 1;
		panel_3.add(textField_2, gbc_textField_2);

		label_1 = new JLabel("CAZAS PESADOS");
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.insets = new Insets(0, 0, 5, 0);
		gbc_label_1.gridx = 1;
		gbc_label_1.gridy = 1;
		panel_3.add(label_1, gbc_label_1);

		textField_3 = new JTextField();
		textField_3.setText("0");
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.gridx = 0;
		gbc_textField_3.gridy = 2;
		panel_3.add(textField_3, gbc_textField_3);

		label_2 = new JLabel("CRUCEROS");
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.insets = new Insets(0, 0, 5, 0);
		gbc_label_2.gridx = 1;
		gbc_label_2.gridy = 2;
		panel_3.add(label_2, gbc_label_2);

		textField_4 = new JTextField();
		textField_4.setText("0");
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 3;
		panel_3.add(textField_4, gbc_textField_4);

		label_3 = new JLabel("NAVES BATALLA");
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.insets = new Insets(0, 0, 5, 0);
		gbc_label_3.gridx = 1;
		gbc_label_3.gridy = 3;
		panel_3.add(label_3, gbc_label_3);

		textField_5 = new JTextField();
		textField_5.setText("0");
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.gridx = 0;
		gbc_textField_5.gridy = 4;
		panel_3.add(textField_5, gbc_textField_5);

		label_4 = new JLabel("ACORAZADOS");
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.insets = new Insets(0, 0, 5, 0);
		gbc_label_4.gridx = 1;
		gbc_label_4.gridy = 4;
		panel_3.add(label_4, gbc_label_4);

		textField_6 = new JTextField();
		textField_6.setText("0");
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.gridx = 0;
		gbc_textField_6.gridy = 5;
		panel_3.add(textField_6, gbc_textField_6);

		label_5 = new JLabel("BOMBARDEROS");
		GridBagConstraints gbc_label_5 = new GridBagConstraints();
		gbc_label_5.insets = new Insets(0, 0, 5, 0);
		gbc_label_5.gridx = 1;
		gbc_label_5.gridy = 5;
		panel_3.add(label_5, gbc_label_5);

		textField_7 = new JTextField();
		textField_7.setText("0");
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.gridx = 0;
		gbc_textField_7.gridy = 6;
		panel_3.add(textField_7, gbc_textField_7);

		label_6 = new JLabel("DESTRUCTORES");
		GridBagConstraints gbc_label_6 = new GridBagConstraints();
		gbc_label_6.insets = new Insets(0, 0, 5, 0);
		gbc_label_6.gridx = 1;
		gbc_label_6.gridy = 6;
		panel_3.add(label_6, gbc_label_6);

		textField_8 = new JTextField();
		textField_8.setText("0");
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.gridx = 0;
		gbc_textField_8.gridy = 7;
		panel_3.add(textField_8, gbc_textField_8);

		label_7 = new JLabel("ESTRELLAS");
		GridBagConstraints gbc_label_7 = new GridBagConstraints();
		gbc_label_7.insets = new Insets(0, 0, 5, 0);
		gbc_label_7.gridx = 1;
		gbc_label_7.gridy = 7;
		panel_3.add(label_7, gbc_label_7);

		textField_10 = new JTextField();
		textField_10.setText("0");
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.gridx = 0;
		gbc_textField_10.gridy = 8;
		panel_3.add(textField_10, gbc_textField_10);

		label_8 = new JLabel("NPC");
		GridBagConstraints gbc_label_8 = new GridBagConstraints();
		gbc_label_8.insets = new Insets(0, 0, 5, 0);
		gbc_label_8.gridx = 1;
		gbc_label_8.gridy = 8;
		panel_3.add(label_8, gbc_label_8);

		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setColumns(10);
		GridBagConstraints gbc_textField_20 = new GridBagConstraints();
		gbc_textField_20.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_20.insets = new Insets(0, 0, 5, 5);
		gbc_textField_20.gridx = 0;
		gbc_textField_20.gridy = 9;
		panel_3.add(textField_20, gbc_textField_20);

		label_9 = new JLabel("NGC");
		GridBagConstraints gbc_label_9 = new GridBagConstraints();
		gbc_label_9.insets = new Insets(0, 0, 5, 0);
		gbc_label_9.gridx = 1;
		gbc_label_9.gridy = 9;
		panel_3.add(label_9, gbc_label_9);

		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setColumns(10);
		GridBagConstraints gbc_textField_21 = new GridBagConstraints();
		gbc_textField_21.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_21.insets = new Insets(0, 0, 5, 5);
		gbc_textField_21.gridx = 0;
		gbc_textField_21.gridy = 10;
		panel_3.add(textField_21, gbc_textField_21);

		label_10 = new JLabel("RECICLAS");
		GridBagConstraints gbc_label_10 = new GridBagConstraints();
		gbc_label_10.insets = new Insets(0, 0, 5, 0);
		gbc_label_10.gridx = 1;
		gbc_label_10.gridy = 10;
		panel_3.add(label_10, gbc_label_10);

		panel_4 = new JPanel();
		panel_2.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new BorderLayout(0, 0));

		panel_5 = new JPanel();
		panel_4.add(panel_5, BorderLayout.NORTH);

		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);

		btnCalcular = new JButton("CALCULAR");

		panel_6 = new JPanel();
		panel_6.setLayout(new BorderLayout(0, 0));
		GroupLayout gl_panel_5 = new GroupLayout(panel_5);
		gl_panel_5.setHorizontalGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_5.createSequentialGroup().addContainerGap()
						.addComponent(btnCalcular, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED, 353, Short.MAX_VALUE).addComponent(panel_6,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGap(386)));
		gl_panel_5.setVerticalGroup(gl_panel_5.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_5.createSequentialGroup().addGroup(gl_panel_5.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_5.createSequentialGroup().addGap(16).addComponent(panel_6,
								GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_5.createSequentialGroup().addContainerGap().addComponent(btnCalcular,
								GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		panel_5.setLayout(gl_panel_5);

		panel_7 = new JPanel();
		panel_4.add(panel_7, BorderLayout.CENTER);

		lblNewLabel_2 = new JLabel("ROBADO");

		lblReciclado = new JLabel("RECICLADO 1");

		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setColumns(10);

		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setColumns(10);

		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setColumns(10);

		textField_25 = new JTextField();
		textField_25.setText("0");
		textField_25.setColumns(10);

		textField_26 = new JTextField();
		textField_26.setText("0");
		textField_26.setColumns(10);

		JLabel lblCristal = new JLabel("CRISTAL");

		lblMetal = new JLabel("METAL");

		lblNewLabel = new JLabel("DEUTERIO");

		lblGanancias = new JLabel("GANANCIAS");
		
		textField_27 = new JTextField();
		textField_27.setText("0");
		textField_27.setColumns(10);
		
		textField_28 = new JTextField();
		textField_28.setText("0");
		textField_28.setColumns(10);
		
		JLabel lblReciclado_1 = new JLabel("RECICLADO2");
		GroupLayout gl_panel_7 = new GroupLayout(panel_7);
		gl_panel_7.setHorizontalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addGroup(gl_panel_7.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_2)
								.addComponent(lblReciclado)
								.addComponent(lblReciclado_1))
							.addGap(29)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMetal)
								.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_panel_7.createSequentialGroup()
									.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblCristal)
										.addComponent(lblGanancias))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_panel_7.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblNewLabel, Alignment.LEADING)
										.addComponent(textField_24, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))
					.addContainerGap())
		);
		gl_panel_7.setVerticalGroup(
			gl_panel_7.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_7.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblGanancias)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCristal)
						.addComponent(lblMetal)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_23, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_24, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblReciclado)
						.addComponent(textField_25, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_26, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_7.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_7.createParallelGroup(Alignment.BASELINE)
							.addComponent(textField_27, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(textField_28, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblReciclado_1))
					.addGap(36)
					.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
					.addContainerGap())
		);
		panel_7.setLayout(gl_panel_7);

		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double metal1 = 0;
				double metal2 = 0;
				double cristal1 = 0;
				double cristal2 = 0;
				double duty1 = 0;
				double duty2 = 0;
				double fmetal=Double.parseDouble(textField_13.getText());
				double fcristal=Double.parseDouble(textField_23.getText());
				double fduty=Double.parseDouble(textField_24.getText());
				double rmetal=Double.parseDouble(textField_25.getText())+Double.parseDouble(textField_27.getText());
				double rcristal=Double.parseDouble(textField_26.getText())+Double.parseDouble(textField_28.getText());
				
				
				StringBuilder sb = new StringBuilder();

				// entrada de datos
				int lij1 = Integer.parseInt(textField.getText());
				int pes1 = Integer.parseInt(textField_14.getText());
				int cru1 = Integer.parseInt(textField_15.getText());
				int nb1 = Integer.parseInt(textField_16.getText());
				int aco1 = Integer.parseInt(textField_17.getText());
				int bomb1 = Integer.parseInt(textField_19.getText());
				int d1 = Integer.parseInt(textField_22.getText());
				int e1 = Integer.parseInt(textField_18.getText());
				int npc1 = Integer.parseInt(textField_11.getText());
				int ngc1 = Integer.parseInt(textField_12.getText());
				int r1 = Integer.parseInt(textField_9.getText());

				metal1 += lij1 * 3000;
				cristal1 += lij1 * 1000;
				metal1 += pes1 * 6000;
				cristal1 += pes1 * 4000;
				metal1 += cru1 * 20000;
				cristal1 += cru1 * 7000;
				duty1 += cru1 * 2000;
				metal1 += nb1 * 45000;
				cristal1 += nb1 * 15000;
				metal1 += aco1 * 30000;
				cristal1 += aco1 * 40000;
				duty1 += aco1 * 15000;
				metal1 += bomb1 * 50000;
				cristal1 += bomb1 * 25000;
				duty1 += bomb1 * 15000;
				metal1 += d1 * 60000;
				cristal1 += d1 * 50000;
				duty1 += d1 * 15000;
				metal1 += e1 * 5000000;
				cristal1 += e1 * 4000000;
				duty1 += e1 * 1000000;
				metal1 += npc1 * 2000;
				cristal1 += npc1 * 2000;
				metal1 += ngc1 * 6000;
				cristal1 += ngc1 * 6000;
				metal1 += r1 * 10000;
				cristal1 += r1 * 6000;
				duty1 += r1 * 2000;
				
				int lij2 = Integer.parseInt(textField_1.getText());
				int pes2 = Integer.parseInt(textField_2.getText());
				int cru2 = Integer.parseInt(textField_3.getText());
				int nb2 = Integer.parseInt(textField_4.getText());
				int aco2 = Integer.parseInt(textField_5.getText());
				int bomb2 = Integer.parseInt(textField_6.getText());
				int d2 = Integer.parseInt(textField_7.getText());
				int e2 = Integer.parseInt(textField_8.getText());
				int npc2 = Integer.parseInt(textField_10.getText());
				int ngc2 = Integer.parseInt(textField_20.getText());
				int r2 = Integer.parseInt(textField_21.getText());
				
				
				
				metal2 += lij2 * 3000;
				cristal2 += lij2 * 1000;
				metal2 += pes2 * 6000;
				cristal2 += pes2 * 4000;
				metal2 += cru2 * 20000;
				cristal2 += cru2 * 7000;
				duty2 += cru2 * 2000;
				metal2 += nb2 * 45000;
				cristal2 += nb2 * 15000;
				metal2 += aco2 * 30000;
				cristal2 += aco2 * 40000;
				duty2 += aco2 * 15000;
				metal2 += bomb2 * 50000;
				cristal2 += bomb2 * 25000;
				duty2 += bomb2 * 15000;
				metal2 += d2 * 60000;
				cristal2 += d2 * 50000;
				duty2 += d2 * 15000;
				metal2 += e2 * 5000000;
				cristal2 += e2 * 4000000;
				duty2 += e2 * 1000000;
				metal2 += npc2 * 2000;
				cristal2 += npc2 * 2000;
				metal2 += ngc2 * 6000;
				cristal2 += ngc2 * 6000;
				metal2 += r2 * 10000;
				cristal2 += r2 * 6000;
				duty2 += r2 * 2000;
				
				
				
				
				
				sb.append("El atacante 1 ha perdido "+(long)metal1+" de metal, "+(long)cristal1+" de cristal y "+(long)duty1+" de deuterio\n\n");
				
				sb.append("El atacante 2 ha perdido "+(long)metal2+" de metal, "+(long)cristal2+" de cristal y "+(long)duty2+" de deuterio\n\n");
				
				double m=fmetal+rmetal-metal1-metal2;
				double c=fcristal+rcristal-cristal1-cristal2;
				//EN caso de que no haya suficiente duty para los 2 se reparte a medias
				if(fduty<duty1+duty2){
					duty1=0;
					duty2=0;
				}
				double d=fduty;
				sb.append("M="+m+"\n");
				sb.append("C="+c+"\n");
				sb.append("D="+d+"\n\n");
				
				sb.append("Al atacante 1 le corresponden "+(metal1+m/2)+" de metal, "+(cristal1+c/2)+" de cristal y "+(duty1+(d/2))+" de deuterio\n\n");
				
				sb.append("Al atacante 2 le corresponden "+(metal2+m/2)+" de metal, "+(cristal2+c/2)+" de cristal y "+(duty2+(d/2))+" de deuterio\n\n");
				
				
				
				textArea.setText(sb.toString());
			}
		});

	}
}
