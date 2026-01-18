Rapport de Projet 

Système de Gestion Bancaire 

 

1. Introduction 

Ce projet consiste à développer une application de gestion bancaire en Java permettant de gérer différents types de comptes, d’effectuer des opérations bancaires et de produire des relevés. L’objectif principal est de mettre en pratique les concepts de la programmation orientée objet, notamment l’abstraction, le polymorphisme, l’utilisation des interfaces ainsi que la gestion des exceptions métier. 

 

2. Objectifs pédagogiques 

Maîtriser l’abstraction et le polymorphisme 

Implémenter des interfaces pour définir des comportements communs 

Gérer les transactions et leur historique à l’aide des collections 

Appliquer des patterns de conception (Factory, Strategy) 

Gérer les exceptions métier personnalisées 

 

3. Présentation générale du système 

Le système permet : 

La gestion des clients et de leurs comptes 

La réalisation des opérations bancaires (dépôt, retrait, virement) 

L’enregistrement de toutes les transactions avec date et type 

La génération de relevés et la consultation de l’historique 

L’application est développée en Java 8+ et repose sur une architecture orientée objet claire et modulaire. 

 

4. Acteurs du système 

Client : titulaire d’un ou plusieurs comptes bancaires 

Système bancaire : gère les comptes, les opérations et les règles métier 

 

5. Cas d’utilisation 

5.1 Enregistrer un client 

Description : Permet d’ajouter un nouveau client au système. 

Scénario nominal : 

Le système demande les informations du client (nom, prénom, CIN, adresse) 

Les informations sont validées 

Le client est enregistré avec succès 

Résultat : Le client est ajouté à la base du système. 

 

5.2 Ouvrir un compte bancaire 

Description : Permet d’ouvrir un compte pour un client existant. 

Scénario nominal : 

Le client choisit le type de compte (courant, épargne, entreprise) 

Le système vérifie le montant minimum requis 

Le compte est créé et associé au client 

Résultat : Le compte est actif et rattaché au client. 

 

5.3 Effectuer un dépôt 

Description : Ajouter de l’argent sur un compte. 

Scénario nominal : 

Le client sélectionne un compte 

Il saisit un montant positif 

Le système met à jour le solde 

Une transaction de type dépôt est enregistrée 

 

5.4 Effectuer un retrait 

Description : Retirer de l’argent d’un compte. 

Scénario nominal : 

Le client sélectionne un compte 

Le système vérifie le solde et les règles de retrait 

Le montant est débité 

Une transaction de type retrait est enregistrée 

Scénarios alternatifs : 

Solde insuffisant → exception levée 

Dépassement de limite → exception levée 

 

5.5 Effectuer un virement 

Description : Transférer de l’argent entre deux comptes. 

Scénario nominal : 

Sélection du compte source et du compte destination 

Vérification du solde et des limites 

Débit du compte source 

Crédit du compte destination 

Enregistrement des transactions 

 

5.6 Consulter l’historique des transactions 

Description : Visualiser toutes les opérations effectuées sur un compte. 

Fonctionnalités : 

Affichage par période 

Filtrage par type de transaction 

 

5.7 Générer un relevé bancaire 

Description : Produire un relevé mensuel d’un compte. 

Résultat : Liste structurée des transactions avec dates et montants. 

 

6. Documentation technique 

6.1 Architecture 

Le système repose sur une classe abstraite Compte dont héritent plusieurs types de comptes. Chaque type de compte implémente ses propres règles métier. 

6.2 Classes principales 

Compte (abstraite) : définit les méthodes communes (dépôt, retrait, virement) 

CompteCourant : autorise un découvert limité 

CompteEpargne : permet le calcul des intérêts et interdit le découvert 

CompteEntreprise : autorise des transactions élevées 

Client : possède une liste de comptes 

Transaction : représente une opération bancaire avec date et type 

 

6.3 Interfaces 

CalculInteret : définit le comportement de calcul des intérêts 

 

6.4 Exceptions personnalisées 

SoldeInsuffisantException : solde insuffisant pour l’opération 

MontantInvalideException : montant négatif ou nul 

LimiteDepasseeException : dépassement des plafonds autorisés 

 

6.5 Technologies utilisées 

Java 8+ 

Collections Framework 

API Date/Time (LocalDate, LocalDateTime) 

Programmation Orientée Objet 

 

7. Conclusion 

Ce projet de système de gestion bancaire permet d’appliquer de manière concrète les concepts fondamentaux de la programmation orientée objet. L’architecture mise en place garantit la maintenabilité, l’extensibilité et la robustesse du système tout en respectant les règles métier du domaine bancaire. 

 

Salma DAKAK 

 
