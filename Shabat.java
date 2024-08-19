package programfornewpc;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Shabat {

    @FXML
    private Button steamButton;
    @FXML
    private Button epicButton;
    @FXML
    private Button ubisoftButton;
    @FXML
    private Button eaButton;
    @FXML
    private Button operaButton;
    @FXML
    private Button firefoxButton;
    @FXML
    private Button chromeButton;
    @FXML
    private Button braveButton;
    @FXML
    private Button discordButton;
    @FXML
    private Button vlcButton;
    @FXML
    private Button winrarButton;
    @FXML
    private Button revoButton;
    @FXML
    private Button monkrusOfficeButton;
    @FXML
    private Button windirstatButton;
    @FXML
    private Button nvidiaAppButton;
    @FXML
    private Button amdDriversButton;
    @FXML
    private Button cpuZButton;
    @FXML
    private Button torBrowserButton;
    @FXML
    private Button officeActiveDownloadButton;
    @FXML
    private Button monkrusPhotoshopButton;
    @FXML
    private Button monkrusOffice2Button;
    @FXML
    private Button onlineFixButton;
    @FXML
    private Button monkrusAdobeButton;
    @FXML
    private Button searchButton;
    
    @FXML
    private TextField fitgirlsearch;

    @FXML
    private TextField allkeyshopsearch;
    
    @FXML
    private Button Lossless;
    
    @FXML
    private Button sandboxie;

    @FXML
    private Button pircy_wiki;

    @FXML
    private Button drive_program;
    
    @FXML
    void pircy_wiki(ActionEvent event) {
        openURL("https://rentry.org/pgames");

    }

    @FXML
    void sandboxie(ActionEvent event) {
        openURL("https://sandboxie-plus.com/");

    }
    
    @FXML
    void drive_program(ActionEvent event) {
        openURL("https://drive.google.com/drive/u/6/folders/12-9_sqG32Ermscp8Bt5tkDozHdPFjfMI");

    }

    @FXML
    void Lossless(ActionEvent event) {	
        openURL("https://drive.google.com/file/d/1U78PTJfEEUkWdzIXAihkx2oRZWyab6AJ/view?usp=sharing");


    }

    @FXML
    void openSteam(ActionEvent event) {
        openURL("https://cdn.cloudflare.steamstatic.com/client/installer/SteamSetup.exe");
    }

    @FXML
    void openEpic(ActionEvent event) {
        openURL("https://store.epicgames.com/en-US/");
    }

    // Placeholder methods for other buttons
    @FXML
    void openUbisoft(ActionEvent event) {
        openURL("https://www.ubisoft.com/en-us/ubisoft-connect/download");
    }

    @FXML
    void openEA(ActionEvent event) {
        openURL("https://origin-a.akamaihd.net/EA-Desktop-Client-Download/installer-releases/EADesktopInstaller.exe");
    }

    @FXML
    void openOpera(ActionEvent event) {
        openURL("https://www.opera.com/download");
    }

    @FXML
    void openFirefox(ActionEvent event) {
        openURL("https://www.mozilla.org/firefox/download");
    }

    @FXML
    void openChrome(ActionEvent event) {
        openURL("https://www.google.com/chrome/");
    }

    @FXML
    void openBrave(ActionEvent event) {
        openURL("https://brave.com/download/");
    }

    @FXML
    void openDiscord(ActionEvent event) {
        openURL("https://discord.com/download");
    }

    @FXML
    void openVLC(ActionEvent event) {
        openURL("https://www.videolan.org/vlc/");
    }

    @FXML
    void openMonkrusOffice(ActionEvent event) {
        openURL("https://w14.monkrus.ws/2023/06/office-2016-2021-build-2304-rus-eng-x86.html");
    }

    @FXML
    void openWindirstat(ActionEvent event) {
        openURL("https://windirstat.net/");
    }

    @FXML
    void openNvidiaApp(ActionEvent event) {
        openURL("https://www.nvidia.com/Download/index.aspx");
    }

    @FXML
    void openAmdDrivers(ActionEvent event) {
        openURL("https://www.amd.com/en/support");
    }

    @FXML
    void openCpuZ(ActionEvent event) {
        openURL("https://www.cpuid.com/softwares/cpu-z.html");
    }

    @FXML
    void openTorBrowser(ActionEvent event) {
        openURL("https://www.torproject.org/download/");
    }
    //on pregress
    @FXML
    void openOfficeActiveDownload(ActionEvent event) {
    	// Command components
        String powerShellCommand = "irm https://massgrave.dev/get | iex";
        String[] command = {"powershell.exe", "-Command", powerShellCommand};

        // Using ProcessBuilder to run the command
        ProcessBuilder builder = new ProcessBuilder(command);
        builder.redirectErrorStream(true); // This merges the error stream and the output stream.

        try {
            Process process = builder.start();

            // Reading the output from the command
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Waiting for the command to complete
            int exitCode = process.waitFor();
            if (exitCode == 0) {
                System.out.println("Command executed successfully!");
            } else {
                System.out.println("Command execution failed with exit code " + exitCode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            System.out.println("Command execution interrupted.");
            Thread.currentThread().interrupt(); // restore interrupted status
        }
    }

    @FXML
    void openMonkrusPhotoshop(ActionEvent event) {
        openURL("https://w14.monkrus.ws/2024/03/adobe-photoshop-2024-v256-multilingual.html");
    }

    @FXML
    void openMonkrusOffice2(ActionEvent event) {
        String baseUrl = "https://www.allkeyshop.com/blog/catalogue/search-";
        String name = allkeyshopsearch.getText();
        String[] result = name.split(" ");
        for (String element : result) {
        	baseUrl=baseUrl+element+"+";
        	 System.out.println(baseUrl);
        }
        openURL(baseUrl);
        
    }

    @FXML
    void openOnlineFix(ActionEvent event) {
        openURL("https://online-fix.me/");
    }

    @FXML
    void openMonkrusAdobe(ActionEvent event) {
        openURL("https://w14.monkrus.ws/2024/04/adobe-acrobat-pro-2024-v24120643-x64.html");
    }

    @FXML
    void performSearch(ActionEvent event) {
        String baseUrl = "https://fitgirl-repacks.site/?s=";
        String name = fitgirlsearch.getText();
        String[] result = name.split(" ");
        for (String element : result) {
        	baseUrl=baseUrl+element+"+";
        	 System.out.println(baseUrl);
        }
        openURL(baseUrl);
    }
    
    @FXML
    void openWinrar(ActionEvent event) {
        openURL("https://www.win-rar.com/start.html?&L=0");
    }
    @FXML
    void openRevo(ActionEvent event) {
        openURL("https://www.revouninstaller.com/start-freeware-download/");
    }

    // Additional methods for other buttons can be implemented here...

    // General method to open a URL in the default system browser
    private void openURL(String url) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            try {
                desktop.browse(new URI(url));
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported on this platform.");
        }
    }
    

   }


