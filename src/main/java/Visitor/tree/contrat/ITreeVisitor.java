package Visitor.tree.contrat;

import java.util.List;

public interface ITreeVisitor {
    ComposantIntf visitTree (ComposantIntf t, List<ComposantIntf> trees, int i);
}
