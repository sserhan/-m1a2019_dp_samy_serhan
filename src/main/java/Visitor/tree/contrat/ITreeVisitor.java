package Visitor.tree.contrat;

import Visitor.tree.modele.Composant;

import java.util.List;

public interface ITreeVisitor {
    Composant visitTree (Composant t, List<Composant> trees, int i);
}
