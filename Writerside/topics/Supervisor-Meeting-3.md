# Supervisor Meeting 3
Date: 2024-02-26  
Time: 08:52  

## Missing Attendees
- Lars Emanuel Hansen

## Agenda
- Discuss the following problem statements

It is a problem that there is no 'easy' way to explore/test/run the behavior and evolution of a database during its lifetime. As a solution, we propose a symbolic database simulator/debugger/explorer allowing for symbolic execution of the DML given some schema, and with the possibility to extend the execution to the DDL.

## Meeting notes
As it is written, it's too broad. Make sure to scope it well.

### Gabriela's questions
Who is going to use the solution: Maybe the database expert to use it as an analysis tool. Possibly with some crossover to the domain expert.

What is the goal of the system: To make sure the database expert does not make mistakes / faster

What makes it easy - you should define the properties more clearly.
How can we measure that it really is easier to use this tool.

It is still a bit unclear, but it sounds like the expert interacts with some abstract model. Will the model be used to generate stuff? Possibly.

Gabriela: You may have to focus on only some of the things that are possible in DML.

We need to decide if we want soundness or completeness.
Gabriela: Especially important because you are using these formalizations and its important to consider which direction to go.

## Action items
*These action items should be written on the GitHub project board*

##### Group
- [x] Send invite to next meeting
- [ ] Send first draft of intro/related work.

##### Supervisor
None