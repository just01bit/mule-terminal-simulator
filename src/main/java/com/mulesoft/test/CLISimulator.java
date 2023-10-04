package com.mulesoft.test;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Map;


public class CLISimulator {

	public static void main(String[] args) throws Exception {
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command(args);
        String output = "\n[Command Output]\n";

        try{

            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            
            String line = "";
            
            while ((line = reader.readLine()) != null) {
                output = output + line + "\n";
            }

            int exitCode = process.waitFor();
            output = output + "[Exited with error code] " + exitCode + "\n";

            process.destroy();            
            
            FileWriter outputWriter = new FileWriter("/tmp/mule-terminal-simulator-output.txt");
            outputWriter.write(output);
            outputWriter.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}
