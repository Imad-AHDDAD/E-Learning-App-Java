<h1 align="center">
  Réalisation d’une application d'Elearning :
</h1>

### Outils de developement :
- NetBeans
- Language JAVA
- Java Swing
- Mamp Server

### Les interfaces de l'application :
- Page Login :

![image](https://user-images.githubusercontent.com/103340643/215909851-83023be0-24af-4207-b663-9727cb79f9fb.png)

- Interface de l'admin :

![image](https://user-images.githubusercontent.com/103340643/215909990-13e259bb-530e-4539-9d34-79517b4ad372.png)

- Interface de l'enseignant (dashboard) :

![image](https://user-images.githubusercontent.com/103340643/215910238-e3278eed-e6d5-4c12-83c0-931906a18c96.png)

- Interface de l'etudiant :

![image](https://user-images.githubusercontent.com/103340643/215910368-1a08756b-41eb-469a-a3d2-5557a76a3ec4.png)

- Interface du cours : 

![image](https://user-images.githubusercontent.com/103340643/215910547-72bf08ba-85f0-4b67-8d86-1f35b9efc09a.png)

---
### Concernant la base de données , vous trouverez ci joint un fichier "Elearning.sql" , à importer pour qu la base de données soit créée et remplie

---

### La structure du projet :
Dans le dossier src Vous trouverez les dossiers suivants : 
- images : contient les images utilisées dans l'application (ex: image de la page d'acceuil)
- GUI : contient les interfaces graphiques
- server : contient 4 classes :
  - server.java : c'est le serveur qui s'occupe à transmettre les messages les utilisateurs
  - serverPort : c'est le serveur qui s'occupe à changer l'adress ip et le port de l'utilisateur aprés que se dernier se connecte
  - serverVideo : c'est le serveur qui s'occupe à à transmettre l'appel video entre l'enseignant et les etudiants
  - serverRMI : c'est le serveur qui s'occupe à partager le tableau blanc entre l'enseignant et les etudiants
- entities : contient les entités (classes) utilisées durant l'application (chaque entité se traduit par une table dans la base de données)
- interfaces : il contient les interfaces utilisées pour partager le tableau blan via RMI entre l'enseignant et les etudiants
- dbConnection : il contient la classe qui sert a ouvrir une connexion à la base de données 
 
 ---
 
### Pour lancer l'application :
- il faut tout d'abord importer le fichier Elearning.sql à la base de donneés
- executer les 4 classes du package servers
- enfin executer la classe Login_Form.java du package GUI

-- NB: à chaque fois qu'on veut acceder a l'application , il faut executer la classe Login_Form.java .

### Pour se connecter Vous pouvez utiliser les comptes suivants :

- comme admin (username : imadahddad , password : imadahddad)
- comme enseignant (username : charraahmed , password : charraahmed)
- comme etudiant (username : AHDDAD1 , password : AHDDAD1)
- comme etudiant (username : AHDDAD2 , password : AHDDAD2)
- comme etudiant (username : AHDDAD3 , password : AHDDAD3)
  
 
