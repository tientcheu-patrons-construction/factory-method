# Patron Factory

Devoir n°1 – Patrons de construction (INF461)
TIENTCHEU TCHOKOUATOU Emmanuel – 20Q2998

## Principe

Une classe `FabriqueProduit` crée les produits à la place du client.
Le client ne connaît que la classe abstraite `Produit` : il demande un produit
à la fabrique avec une catégorie, sans jamais faire `new ProduitA()` lui-même.

## Contenu du dépôt

| Dossier | Description |
|---|---|
| `exemple-cours/` | Exemple vu en cours : `ProduitA`, `ProduitB`, `ProduitC` |
| `exemple-modifie/` | Exemple modifié : ajout d'un quatrième produit `ProduitD` |

## Modification apportée

- Ajout de la classe `ProduitD` (hérite de `Produit`)
- Ajout de la catégorie `TYPE_D` et de son cas dans `FabriqueProduit`
- `App` crée et utilise aussi un produit de type D


