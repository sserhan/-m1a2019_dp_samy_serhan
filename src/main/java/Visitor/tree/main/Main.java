package Visitor.tree.main;

import Visitor.tree.contrat.ComposantIntf;
import Visitor.tree.contrat.ITreeVisitor;
import Visitor.tree.modele.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Main, construit un arbre de 3 étages et lance un parcours en profondeur puis en largeur
 * Elle lance ensuite le parcours de partition pour récupérer le
 */
public class Main {
    public static void main (String [] args){
        ComposantIntf tree = new Node(10);
        tree.addNode(new Node(5));
        tree.addNode(new Node(15));
        List<ComposantIntf> children = new ArrayList<>(tree.getChildren());
        children.get(0).addNode(new Leaf(2));
        children.get(0).addNode(new Leaf(4));
        children.get(1).addNode(new Leaf(11));
        children.get(1).addNode(new Leaf(17));

        ITreeVisitor visitorP = new VisitorTreeProfondeur();
        ITreeVisitor visitorL = new VisitorTreeLargeur();

        System.out.println("PARCOURS EN PROFONDEUR : ");
        ComposantIntf profondeur = visitorP.visitTree(tree, new ArrayList<>(tree.getChildren()), 17);
        if (profondeur == null) {
            System.out.println("Composant non trouvé");
        } else {
            System.out.println("LE COMPOSANT EST UN NOEUD ? " + profondeur.isNode() + " SA VALEUR EST " + profondeur.getValue());
        }

        System.out.println("PARCOURS EN LARGEUR : ");
        ComposantIntf largeur = visitorL.visitTree(tree, new ArrayList<>(tree.getChildren()), 17);
        if(largeur == null){
            System.out.println("Composant non trouvé");
        } else {
            System.out.println("LE COMPOSANT EST UN NOEUD ? " + largeur.isNode() + " SA VALEUR EST " + largeur.getValue());
        }

        System.out.println("VISITE PARTION EN PROFONDEUR");
        List<ComposantIntf> pairs = new ArrayList<>();
        List<ComposantIntf> impairs = new ArrayList<>();
        visitorP.visitPartition(tree,new ArrayList<>(tree.getChildren()),pairs,impairs);
        System.out.println("PAIRS : ");
        pairs.stream().map(ComposantIntf::getValue).forEach(System.out::println);
        System.out.println("IMPAIRS : ");
        impairs.stream().map(ComposantIntf::getValue).forEach(System.out::println);

        System.out.println("VISITE PARTION EN LARGEUR");
        pairs.clear();
        impairs.clear();
        visitorL.visitPartition(tree,new ArrayList<>(tree.getChildren()),pairs,impairs);
        System.out.println("PAIRS : ");
        pairs.stream().map(ComposantIntf::getValue).forEach(System.out::println);
        System.out.println("IMPAIRS : ");
        impairs.stream().map(ComposantIntf::getValue).forEach(System.out::println);
    }
}
