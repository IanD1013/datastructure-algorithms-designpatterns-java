package designpattern.structural.decorator.exercise;

/**
 * We are going to build a code editor like Intellij or VSCode.
 * When we open a project, we should see all the artefacts (items)
 * in that project.
 *
 * Every artefact should have an icon and the icon can be different
 * from one artefact to another. For example, the Main file's icon
 * has a special green play marker on top of the icon.
 *
 * Similarly, if an artefact includes errors, its icon should include
 * an error marker.
 */

public class Editor {
    public void openProject(String path) {
        AbstractArtefact[] artefacts = {
                new Artefact("Main"),
                new Artefact("Demo"),
                new Artefact("EmailClient"),
                new Artefact("EmailProvider"),
        };

        // We can apply multiple decorators
        artefacts[0] = new ErrorDecorator(new MainDecorator(artefacts[0]));
        artefacts[2] = new ErrorDecorator(artefacts[2]);

        // In the future, we can create a SourceControlDecorator that adds
        // a special marker to the icon if artefacts are not committed to the repository.
        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
}
