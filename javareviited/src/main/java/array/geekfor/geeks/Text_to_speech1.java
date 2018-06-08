package array.geekfor.geeks;

import java.security.AllPermission;
import java.util.Locale;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;
import javax.swing.plaf.synth.SynthSpinnerUI;

public class Text_to_speech1 {

	public static void main(String ri[]){
		
		try{
			//set property as kevin dictionary
			System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
			
			 //register the engine 
			Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
			
			//create a sysnthesizer
			Synthesizer synthesizer=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
			//allocate synthesizer
			synthesizer.allocate();
			//resume synthesizer
			synthesizer.resume();
			
			//speaks the given text until queue is empty
//			synthesizer.speakPlainText("jyoti loves luckie and what did she do she dumped him and "
//					+ "let herself  sleep with another negro guy!"
//					+ "",null);
			synthesizer.speakPlainText("hey Kalakrushna  "
					+ "how are your days going "
					+ "dude",null);
			synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);
			
			//deallocate synthesizer
			synthesizer.deallocate();
			
		}catch(Exception d){
			d.printStackTrace();
		}
	}
}
