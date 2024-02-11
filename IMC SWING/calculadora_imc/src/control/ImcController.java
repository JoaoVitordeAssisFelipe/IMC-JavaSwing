package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.ImcBeam;
import view.MainViewer;
public class ImcController implements ActionListener{
	private MainViewer context;
	private ImcBeam imc;
	
	public ImcController() {
		
	}
	
	public ImcController(MainViewer context) {
		if(this.context == null ) {
			this.context = context;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		imc = new ImcBeam(
				context.getPesoTextField().getText(),
				context.getAlturaTextField().getText()
		);
		context.getResultPane().setText(imc.toString());
		
	}

}
