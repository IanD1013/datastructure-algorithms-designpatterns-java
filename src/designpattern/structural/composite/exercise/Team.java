package designpattern.structural.composite.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * We are building an application for an incident management organization.
 * When an incident (eg fire) occurs, one or more teams may be deployed to
 * attack the incident.
 *
 * A team often includes a truck and one or more human resources. It can
 * also include a sub-team. For example, for a medium-sized incident, we
 * may need to deploy two teams and each team may contain a truck and two
 * persons.
 *
 * - Team
 *  - Sub Team 1
 *      - Truck
 *      - Human Resource
 *      - Human Resource
 *  - Sub Team 2
 *      - Truck
 *      - Human Resource
 *      - Human Resource
 */
public class Team extends Resource {
    private List<Resource> resources = new ArrayList<>();

    public void add(Resource resource) {
        resources.add(resource);
    }

    public void deploy() {
        for (var resource : resources)
            resource.deploy();
    }
}