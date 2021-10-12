package AppLogic;

import java.util.Locale;  
import javax.speech.Central;  
import javax.speech.synthesis.Synthesizer;  
import javax.speech.synthesis.SynthesizerModeDesc;  
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Scanner;

public class Translator {
    
    public static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOU URL HERE
        String urlStr = "https://script.google.com/macros/s/AKfycbygFnyIKNVv0GhUCQSJ3NTUG-RCHFVteZM3im5coGQfVpx5adc/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8") +
                "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
    
    public static void speech(String text) throws IOException {
        try {  
            //setting properties as Kevin Dictionary  
            System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us" + ".cmu_us_kal.KevinVoiceDirectory");  
            //registering speech engine  
            Central.registerEngineCentral("com.sun.speech.freetts" + ".jsapi.FreeTTSEngineCentral");  
            //create a Synthesizer that generates voice  
            Synthesizer synthesizer = Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));  
            //allocates a synthesizer  
            synthesizer.allocate();  
            //resume a Synthesizer  
            synthesizer.resume();  
            //speak the specified text until the QUEUE become empty  
            synthesizer.speakPlainText(text, null);  
            synthesizer.waitEngineState(Synthesizer.QUEUE_EMPTY);  
            //deallocating the Synthesizer  
            //synthesizer.deallocate();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }
}