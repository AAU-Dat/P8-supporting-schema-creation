# Supervisor Meeting 4
Date: 2024-03-04
Time: 09:01

## Missing Attendees
- Lars Emanuel Hansen

## Agenda
- Talk about the last two problem statements written below

<tabs group="statements">

<tab title="Statement 1" group-key="PB1">
By Rice's Theorem any non-trivially property of a program is undecidable. One method to overcome this limitation is abstract interpretation. Despite this no general solution employing this technique exist for the SQL DML


</tab>
<tab title="Statement 2" group-key="PB2">

By Rice's Theorem any non-trivially property of a program is undecidable.  One method to overcome this limitation is abstract interpretation. Despite theoretical solutions having been proposed for the DML of relational databases, no solutions exist for the triggers. You can't reason about the soundness of your analysis if arbitrary insertions can be made without triggers, thus an analysis of the DML is unsatisfactory.

</tab>

</tabs>


<tabs group="statements">
<tab title="Tasks" group-key="PB1">
<list>
<li>Can we use Halder and Cortesi's abstract interpretation framework to define a general SQL DML analysis tool?</li>
<li>Can we define abstract primitives that are sufficiently expressive for most testing use cases, yet proven to be weak enough to not be affected by Rice's Theorem?</li>
<li>Can we prove, using Halder and Cortesi's framework, that the tool is sound?</li>
<li>Can we prove, ..., that the tool derives the best approximations?</li>
<li>Under which conditions can we prove the tool to be complete?</li>
<li>Can we create an interface, that allows for quick and easy regression testing?</li>
</list>
</tab>
<tab title="Tasks" group-key="PB2">
<list>
<li>Create schema syntax and parser.</li>
<li>Create a very simple DML syntax and parser.</li>
<li>Create syntax and parser for the Semantic Integrity Constraint Representation Model to model triggers.</li>
<li>Define concrete semantics</li>
<li>Create and implement abstract semantics</li>
<li>Define primitives</li>
<li>Abstraction function</li>
<li>Prove soundness</li>
<li>Prove termination</li>
<li>Prove optimal approximation</li>
<li>Implement Jupyter notebook like interface</li>
<li>Implement REPL interface</li>
</list>
</tab>
</tabs>

## Meeting notes
Lets start with the problem statement.
Gabriela thinks the problem statements are very different.

We kind of steered away from the Halder and Cortesi paper. it seems unrealistic for us to do anything with their framework during this semester. The time feels too short.

We want to focus on the triggers because "Given this type of insert, everything will be alright".

Gabriela is afraid we might end up with something that looks like Halder and Cortesi paper. We should be sure what we want to do so we do not just redo what is in that paper.

We will aim for a happy medium of implementation and theory.

Gabriela: You seem to believe that triggers are easier to manage? To work with triggers, all the other parts must be available first...

Us: We do not think they are easier, on the contrary, we are aware that it is not possible to skip past parts and go directly to triggers.

Gabriela: How is the tools used
Us: uuuuh... We will illustrate that with a model.

## Action items
*These action items should be written on the GitHub project board*
##### Group
- [ ] Make a project timeline today
- [ ] Fancy name model
- [x] Send invite to next meeting

##### Supervisor
None