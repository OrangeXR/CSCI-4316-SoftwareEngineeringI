Document Links: [install](#install) / [usage](#usage)
<img width="1024" height="1024" alt="A graphic-heavy logo" src="https://github.com/user-attachments/assets/976c6553-16f0-441a-859e-90ae828f4231" />
<center> Vulnerability Scanner<br />
Group project for Software Engineering<br /><br />
</center>


Installation:<br />
Navigate to the directory for the installation and install prerequisites:<br />
•	sudo apt update<br />
•	sudo apt install curl<br />
•	sudo apt install python3<br />
•	sudo apt install python3-tk<br />
•	sudo apt install python3-matplotlib<br />
•	sudo apt install python3-pandas<br />
•	sudo apt install python3-networkx<br />
•	sudo apt install -y openjdk-17-jdk<br />
•	wget https://github.com/joernio/joern/releases/download/v4.0.324/joern-install.sh<br />
•	sudo chmod +x joern-install.sh<br />
•	sudo ./joern-install.sh –interactive=false<br />
•	Extract joern-cli.zip<br />
<br />

Now install the vulnerability scanner by downloading the repository zip from github and extracting the zip:<br />
•	wget https://github.com/AndCplusplus/cpg_evaluation-SE/archive/main.zip

<br />
<a name="usage"></a>Usage:<br />
After installing prerequisites and downloading this repository use the terminal to run the teamten.py

In a terminal window run teamten.py:
python3 teamten.py 
<img width="975" height="247" alt="image" src="https://github.com/user-attachments/assets/f68b8381-0fc5-475f-86be-d2acc6ff98f2" />


Once the gui opens press the “Upload File” button and select a .c file to upload:
<img width="834" height="809" alt="image" src="https://github.com/user-attachments/assets/b07a64ab-c900-479e-a9f3-5f3ae2993ea5" />


 
When the file is uploaded the status bar will display the current file.  After your file is loaded press the “Scan for Vulnerabilities” button to begin scan.
<img width="975" height="230" alt="image" src="https://github.com/user-attachments/assets/5448bf42-30a3-44e2-8a5a-5a78de696114" />


 
After the file is scanned the first time a CFG graph showing the vulnerabilities is displayed and the table below the graph will show where the vulnerabilities are located along with the type and severity of the vulnerabilities.
<img width="900" height="877" alt="image" src="https://github.com/user-attachments/assets/09baa66d-0913-42d6-bbbb-23c4d480a053" />


You can then select another type of graph to be displayed for the current file or upload a new file.
<img width="464" height="239" alt="image" src="https://github.com/user-attachments/assets/736f645d-14e8-48e8-b5c4-aacf20ed6e5c" />
<img width="434" height="231" alt="image" src="https://github.com/user-attachments/assets/69c17e88-ca27-4a0f-930f-996b0d704b8a" />


  

Here is a closer look at the table:  
<img width="975" height="100" alt="image" src="https://github.com/user-attachments/assets/9cba486b-5a31-4e14-888d-37e4b2786eda" />




