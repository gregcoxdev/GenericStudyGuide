# Generic Programming Study Guide - JAVA Edition

Dijkstra's Algorithm

This algorithm is used to determine the shortest path from a starting node to a target node in a
weighted graph. The graph can be either directed or undirected but must have a non-negative weight
on each edge.

A weighted graph is a graph in which each branch is given a numerical weight.
http://www.mathcs.emory.edu/~cheung/Courses/171/Syllabus/11-Graph/FIGS/Dijkstra/weight01.gif

A directed graph is a graph in which separate objects are connected together to explain a
relationship. Traversal through this graph is dictated by the direction.
https://media.geeksforgeeks.org/wp-content/uploads/cycle-BFS.png

An undirected graph is a like a directional graph but it makes the assumption that connections go
both ways. In this sense, you can traverse forward and backward, whereas a directed graph may only
allow one direction.
https://www.geeksforgeeks.org/wp-content/uploads/undirectedgraph.png

Dijkstra's algorithm aims to create a tree of the shortest path (including the source node) to each
vertex node until (and including) the end node. It will build a set of nodes that have the minimum
distance from the source.