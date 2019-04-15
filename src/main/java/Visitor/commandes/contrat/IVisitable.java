package Visitor.commandes.contrat;

/**
 * Interface du visitable
 */

public interface IVisitable {
    void accept(IVisitor visitor);
}
