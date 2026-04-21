# Manipulation Dynamique des Fragments 📱

## 📌 Description

Cette application Android démontre l’utilisation des **fragments dynamiques** avec `FragmentManager` et `FragmentTransaction`.
Elle permet de naviguer entre plusieurs fragments au sein d’une seule activité et de gérer les interactions utilisateur.

---

## 🎯 Objectifs du projet

* Créer et utiliser des fragments dynamiques
* Naviguer entre fragments avec `FragmentManager`
* Gérer les événements (clics, interactions UI)
* Comprendre le cycle de vie des fragments
* Manipuler `FragmentTransaction`

---

## 🛠️ Technologies utilisées

* Java
* Android Studio
* Android SDK (API 24+)
* Fragments API

---

## 📂 Structure du projet

```
FragmentApp/
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/fragmentapp/
│   │   │   │   ├── MainActivity.java
│   │   │   │   ├── FragmentOne.java
│   │   │   │   └── FragmentTwo.java
│   │   │   ├── res/layout/
│   │   │   │   ├── activity_main.xml
│   │   │   │   ├── fragment_one.xml
│   │   │   │   └── fragment_two.xml
│   │   │   └── AndroidManifest.xml
├── gradle/
├── build.gradle
└── settings.gradle
```

---

## ⚙️ Fonctionnalités

* Affichage dynamique de fragments
* Navigation entre **FragmentOne** et **FragmentTwo**
* Gestion des événements utilisateur
* Ajout au **Back Stack** pour navigation arrière

---

## 🔄 Navigation entre fragments

* Utilisation de `FragmentManager`
* Transactions avec :

  * `replace()`
  * `addToBackStack()`
  * `commit()`

---

## ▶️ Installation et exécution

1. Cloner le projet :

```bash
git clone https://github.com/youness-lahdiri01/FragmentApp.git
```

2. Ouvrir avec Android Studio

3. Lancer sur :

* Émulateur Android
  ou
* Appareil réel

---

## 📸 Aperçu

<img width="662" height="813" alt="Screenshot 2026-04-21 193022" src="https://github.com/user-attachments/assets/19e5adb7-b863-4e09-8ac3-85fd7fea6578" />
<img width="648" height="814" alt="Screenshot 2026-04-21 193031" src="https://github.com/user-attachments/assets/720a191f-a74e-445c-bc3f-4f0ca74afd26" />

---

## 🧠 Concepts clés

* Fragment lifecycle (onCreate, onCreateView, onDestroy…)
* FragmentTransaction
* Communication Activity ↔ Fragment
* Back Stack navigation

---

## 👨‍💻 Auteur

Youness Lahdiri

---

## 📜 Licence

Projet académique – usage éducatif uniquement.
