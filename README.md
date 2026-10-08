# AutoServiceRom1
# AutoServiceRom1 🚗🔧

## 📌 Despre proiect

**AutoServiceRom1** este o aplicație web pentru gestionarea programărilor la un service auto.

Aplicația este dezvoltată folosind **Java și Spring Boot**, iar scopul proiectului este de a crea o soluție simplă prin care clienții pot solicita o programare și pot selecta serviciile de care au nevoie.

Proiectul este realizat ca aplicație practică pentru dezvoltarea și demonstrarea cunoștințelor de **Java, Spring Boot, Thymeleaf, MySQL și Spring Data JPA**.

---

## 🎯 Funcționalități planificate

### 👤 Pentru client

Clientul va putea:

* vedea serviciile disponibile;
* selecta serviciile dorite;
* solicita o programare;
* introduce numele și numărul de telefon;
* introduce marca și modelul mașinii;
* alege data și ora programării;
* adăuga observații;
* trimite solicitarea către service.

### 🔧 Servicii

Aplicația va include următoarele servicii:

* 📅 Programare la service
* 🛢️ Schimb ulei
* 🔧 Schimb filtre

**Programarea reprezintă solicitarea clientului și nu este un serviciu separat care trebuie selectat.**

### 👨‍💼 Pentru administrator

Administratorul va putea:

* vedea programările primite;
* vedea datele clientului;
* vedea informațiile despre automobil;
* vedea serviciile solicitate;
* vedea data și ora programării;
* accepta programarea;
* respinge programarea atunci când service-ul nu poate efectua lucrarea.

Programările vor avea următoarele stări:

* `PENDING` – în așteptare
* `ACCEPTED` – acceptată
* `REJECTED` – respinsă

---

## 🛠️ Tehnologii utilizate

* **Java 17**
* **Spring Boot**
* **Spring MVC**
* **Spring Data JPA**
* **Hibernate**
* **Thymeleaf**
* **MySQL 8**
* **HTML5**
* **CSS3**
* **Maven**
* **Git**
* **GitHub**
* **IntelliJ IDEA**

---

## 🏗️ Structura aplicației

Proiectul urmează o structură bazată pe Spring Boot:

```text
AutoServiceRom1
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.autoservice
│   │   │       ├── controller
│   │   │       ├── service
│   │   │       ├── repository
│   │   │       ├── entity
│   │   │       └── AutoserviceApplication.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       ├── templates
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

Structura va fi dezvoltată pe măsură ce sunt adăugate noi funcționalități.

---

## 🗄️ Baza de date

Aplicația utilizează **MySQL** pentru stocarea datelor.

Baza de date va conține informații despre:

* clienți;
* automobile;
* servicii;
* programări;
* statusul programărilor.

Legătura dintre aplicație și baza de date este realizată prin **Spring Data JPA / Hibernate**.

---

## 🚀 Rularea proiectului

### 1. Clonează repository-ul

```bash
git clone https://github.com/caprarimihai/AutoServiceRom1.git
```

### 2. Deschide proiectul în IntelliJ IDEA

Deschide folderul:

```text
AutoServiceRom1
```

### 3. Configurează MySQL

Creează baza de date:

```sql
CREATE DATABASE autoservice;
```

Configurează conexiunea în:

```text
src/main/resources/application.properties
```

### 4. Pornește aplicația

Poți porni aplicația din IntelliJ IDEA sau folosind Maven:

```bash
./mvnw spring-boot:run
```

Pe Windows:

```powershell
.\mvnw.cmd spring-boot:run
```

### 5. Accesează aplicația

După pornirea serverului, aplicația poate fi accesată la:

```text
http://localhost:8080/
```

---

## 📈 Dezvoltarea proiectului

Proiectul este construit **pas cu pas**, fiecare funcționalitate importantă fiind adăugată și testată separat.

Etapele principale sunt:

* [x] Crearea proiectului Spring Boot
* [x] Configurarea Maven
* [x] Configurarea MySQL
* [x] Conectarea Spring Boot la MySQL
* [x] Crearea primei pagini web
* [x] Configurarea Git
* [x] Publicarea proiectului pe GitHub
* [ ] Crearea interfeței pentru client
* [ ] Crearea modelului pentru programări
* [ ] Crearea entităților JPA
* [ ] Crearea repository-urilor
* [ ] Crearea serviciilor Spring
* [ ] Crearea formularului de programare
* [ ] Salvarea programărilor în MySQL
* [ ] Panoul administratorului
* [ ] Acceptarea programărilor
* [ ] Respingerea programărilor
* [ ] Validarea datelor
* [ ] Îmbunătățirea interfeței
* [ ] Testarea aplicației

---

## 🎓 Scopul proiectului

Proiectul are atât un scop practic, cât și unul educațional.

Prin dezvoltarea acestei aplicații sunt exersate:

* programarea în Java;
* principiile OOP;
* Spring Boot;
* Spring MVC;
* Dependency Injection;
* Spring Data JPA;
* Hibernate;
* lucrul cu baze de date MySQL;
* dezvoltarea aplicațiilor web;
* Thymeleaf;
* HTML și CSS;
* Git și GitHub;
* organizarea unui proiect software.

---

## 👨‍💻 Autor

**Caprari Mihail**

Proiect realizat pentru dezvoltarea competențelor în **Java / Spring Boot / SQL și dezvoltare web**.
