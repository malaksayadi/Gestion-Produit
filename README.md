# 🛍️ Gestion Produits - Spring Boot

Application web de gestion de produits développée avec Spring Boot et JEE.

## 📋 Description

Cette application permet de gérer un catalogue de produits avec les fonctionnalités CRUD complètes (Create, Read, Update, Delete). Elle est développée en utilisant les technologies modernes du framework Spring.

## 🚀 Technologies utilisées

- **Java** - Langage de programmation
- **Spring Boot** - Framework principal
- **Spring Data JPA** - Gestion de la persistance
- **Spring Web** - API REST
- **Maven** - Gestion des dépendances
- **MySQL (XAMPP)** - Base de données
- **phpMyAdmin** - Gestion de la base de données

## 📦 Fonctionnalités

- ✅ Ajouter un nouveau produit
- ✅ Afficher la liste des produits
- ✅ Modifier les informations d'un produit
- ✅ Supprimer un produit
- ✅ Rechercher des produits

## 🛠️ Installation et Configuration

### Prérequis

- Java JDK 11 ou supérieur
- Maven 3.6+
- XAMPP (avec MySQL activé)
- IntelliJ IDEA / Eclipse

### Étapes d'installation

1. Cloner le repository
```bash
git clone https://github.com/malaksayadi/Gestion-Produit.git
cd Gestion-Produit
```

2. Démarrer XAMPP et activer MySQL

3. Configurer la base de données dans `application.properties`
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_produits
spring.datasource.username=root
spring.datasource.password=
```

4. Compiler et lancer l'application
```bash
mvn clean install
mvn spring-boot:run
```

⚠️ **Note** : La base de données et les tables seront créées automatiquement au premier lancement grâce à `spring.jpa.hibernate.ddl-auto=update`

5. Accéder à l'application
```
http://localhost:8080
```

## 📁 Structure du projet
```
gestionProduitsSB/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/isitcom/gestionProduitsSB/
│   │   │       ├── apirest/          # Contrôleurs REST
│   │   │       ├── controlleur/      # Contrôleurs MVC
│   │   │       ├── entities/         # Entités JPA
│   │   │       ├── repository/       # Repositories
│   │   │       └── service/          # Services métier
│   │   └── resources/
│   │       ├── static/               # Fichiers statiques (CSS, JS)
│   │       ├── templates/            # Templates HTML
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## 🔧 Configuration

Fichier `application.properties` :
```properties
server.port=8080
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_produits
spring.datasource.username=root
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 🧪 Tests

Lancer les tests :
```bash
mvn test
```

## 👥 Auteur

- **Malak Sayadi** - [malaksayadi](https://github.com/malaksayadi)

---

⭐ N'hésitez pas à mettre une étoile si ce projet vous a été utile !
