# Introduction au web

Ce site web est un exemple simple de site sur une seule page qui parle des technolgies web HTML, CSS et javascript ainsi que de GIT. Il est herbergé sur GitHub.

# TODO :

- [x] Créer une branche pour son groupe.
- [x] Créer un champ "Auteur" dans le fichier `README.md` et y mettre les membres du groupe.
- [x] Définir pour chaque membres un rôle : Dev1 ou Dev2.
- [x]  Task 1 (Dev 1) : Réaliser une nouvelle feature pour le site (donc dans une nouvelle branche) => Réaliser une page a propos et mettre un lien vers "a propos dans le footer". Ne pas merge la branche dans main.
- [x] Task 2 (Dev 2) : Réaliser une nouvelle feature pour le site (donc dans une nouvelle branche) => Réaliser une page contact et mettre un lien vers "contact" dans le footer.
- [x] Task 3 (Dev 1) : Merge les deux branches dans main. D'abord la branche de dev 2 puis la branche de dev 1.
- [x] Task 4 (Dev 1) : Dev1 va modifier ajouter une page "mentions légales" et ajouter un lien vers cette page dans le footer sans créer de nouvelle branche. (directement dans votre branche principale). Après avoir fait le commit, ajouter une image dans le dossier images et l'utiliser dans la page d'acceuil (index.html). Faire un commit --amend pour ajouter l'image dans le commit précédent. Puis pusher sur la branche principale.
- [x] Task 5 (Dev 2) : Il faut donner un peu de couleur au site. Pour cela, il faut créer le fichier style.css et ajouter une couleur de fond au body. Puis commit et pusher sur la branche principale. Sans faire de nouvelle branche.
- [x] Task 6 (Dev 1) : En parralléle Dev doit réaliser un petit script javascript qui permet d'afficher un message d'acceuil à l'ouverture de la page (je peux vous donner le code si vous ne savez pas faire). Ce script va se faire sur une nouvelle branche, qui servira à ajouter du dynamisme au site (js). Une fois le script réalisé faire un commit. Puis continué à ajouter quelques éléments dynamique (bouton pour changer la couleur de fond, bouton affichnt un message, etc...).
- [x] Task 7 (Dev 2) : Dev2 veut utiliser mettre en place le message d'acceuil automatique (en js) sur la branche principale sans merger toute la branche js. Pour cela il va utiliser la commande git cherry-pick pour récupérer le commit qui contient le script js. Puis pusher sur la branche principale.
- [ ] Task 8 (Dev 1) : Dev1 veut tester les fonctionnalités proposé par les hooks de git. Pour cela il va créer un fichier pre-commit dans le dossier .git/hooks et y mettre un code simple à éxécuter avant chaque commit (au choix).




## Technologies utilisées

Ce site web utilise HTML et Markdown.

## Licence

Ce site web est publié sous la licence MIT.

## Auteur
Alexandre : Dev1 -> branche : js_alex
Aurore  : Dev2 -> branche : Aurore