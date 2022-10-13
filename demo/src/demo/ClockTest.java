package demo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

class ClockText extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		UtilDateModel model = new UtilDateModel();
		//model.setDate(20,04,2014);
		// Need this...
		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		JDatePanelImpl datePanel = new JDatePanelImpl(model, p);
		// Don't know about the formatter, but there it is...
		SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");

		JDatePickerImpl datePicker = new JDatePickerImpl(datePanel,new DateLabelFormatter());
		datePicker.setBounds(100, 0, 130, 20);
		datePicker.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(datePicker.getJFormattedTextField().getText());
				try {
					Date dt3=(Date) dt1.parse(datePicker.getJFormattedTextField().getText());
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		System.out.println(datePicker.getJFormattedTextField().getText());
		// dt = new Date(datePicker.getModel().getValue());
		//System.out.println(dt);
		JFrame f = new JFrame();
		//JDateChooser dt3 = new JDateChooser();
		//Date d5 = (Date)( dt3.getDate());
		//
		//String d1  = ((JTextField)dt3.getDateEditor().getUiComponent()).getText();
		//System.out.println(d5);
		//System.out.println(d1);
		//f.add(dt3);
		//dt3.setBounds(0,100,120,30);
		f.setBounds(200, 0, 1200, 300);
		f.add(datePicker);
		f.setLayout(null);
		f.setVisible(true);
	}

}
