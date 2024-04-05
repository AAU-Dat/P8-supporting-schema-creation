# Supervisor Meeting 2
Date: 2024-02-21  
Time: 14:00  

## Missing Attendees
- Oliver Holmgaard

## Agenda
- Objective Statement
  - The objective is to find an initial single problem statement.
- Review tasks from last meeting (10 minutes)
  - Lead: Casper
  - Preparation: Read the summary from last meeting.
- What problem statement (if any) should we move forward with, and should any modification be made? (30 minutes)
  - Lead: Daniel
  - Preparation: Read the problem statements at the end of this document
- What tasks should be done before next meeting (10 minutes)
- Any Other Business (5 minutes)

### potential problem statements
1. When defining a database, the structure of the database has a huge impact on the queries. Changes to the schema mean changing the queries, which is an overhead we do not like!
2. In the same vein that DevOps makes it simpler for developers to deal with operated environments, a 'DomainBase' role may make it simpler for domain experts to deal with creating databases.
3. Can we combine various database artifacts to more accurately and unambiguously describe the database.

As a possible solution stated as problem statement :
Can we define an abstract database language, that describes some problem domain unambiguously, but maps the description to multiple equivalent sql schemas? Can we leverage the fact that the description maps to multiple schemas to dynamically switch between them?
- Equivalent how? Content equivalence is too weak.

## Meeting notes
Gabriela: Do you want to work within database? Short answer: yes.

The first 'problem statement' is not really a problem statement.
Gabriela does not see how we can do number 2 as a software project.
Casper: Its meant more as a tool for a domain expert.
Gabriela: The way it is written makes it seem like half a problem statement.

The third one is ambiguous: Database artifacts can be many different things
Casper: We want just a single description of the database, so instead of combining the various artifacts, we would have a single, complete description.
Rephrase: We want to abstract possibly the logical part away.

Synthesizing queries based on a modified version of the database. - Casper, based on a PhD.

Dynamically switch between schemas at runtime.

Questions for us:
- Who is the user?
    - domain users? technical experts? data consumers?
        - API designers are data consumers, but api consumers are too.

We have to consider our philosophical view on some of the DB-creation steps. DB-modification steps.

We have to define our scope more tightly.
Describe the problem. Always describe the problem.

Next meeting: 2024-02-26

## Action items
*These action items should be written on the GitHub project board*

##### Group
- [x] Send invite to next meeting
- [ ] Write a more descriptive problem statement for our own sake
- [ ] Write an introduction that hints at a solution based on this problem statement
- [ ] Describe problem statement as a gap that the paper will contribute to covering

##### Supervisor
- [ ] Look into changes to DB schemas that are destructive in the sense that an attribute/column is removed from some table.