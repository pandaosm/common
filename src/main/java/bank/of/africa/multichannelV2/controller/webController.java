package bank.of.africa.multichannelV2.controller;
//programm has stoppedd in teste CURL 
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import bank.of.africa.multichannelV2.dao.IClientTemp;
import bank.of.africa.multichannelV2.entite.ClientTemp;

@RestController
@RequestMapping("/Api")
public class webController {

	@Autowired
	private IClientTemp ic;

	@Autowired
	private RestTemplate rt;

	@Autowired
	private ModelMapper model;

	@GetMapping("/test")
	InputStream  chaine() throws IOException {
		try {
			Runtime rt = Runtime.getRuntime();
			
			String[] args = {"cmd.exe", "/c", "curl --insecure --location --request GET https://localhost:10404/api/currencies?page=0 --header 'Content-Type: application/json' --header 'Content-Language: EN' --header 'Application-User: 123' --header 'Authorization: Basic YWlzcEFkbWluOkFkbWluQDEwMCU='" };
			ProcessBuilder pb = new ProcessBuilder(args);

			pb.redirectErrorStream(true);
			Process proc = pb.start();
			InputStream ins = proc.getInputStream();
			BufferedReader read = new BufferedReader(new InputStreamReader(ins));
			StringBuilder sb = new StringBuilder();
			read.lines().forEach(line -> {
				System.out.print("line >" + line);
				sb.append(line);
			});
			read.close();
			proc.waitFor();
			int exitCode = proc.exitValue();
			proc.destroy();			    
			return proc.getInputStream();
		} catch (UnsupportedOperationException | IOException e) {
			e.printStackTrace();
			return null;
		} catch (InterruptedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@GetMapping("/testJenkins")
	String cchaine() {
		return "oui";
	}

}
