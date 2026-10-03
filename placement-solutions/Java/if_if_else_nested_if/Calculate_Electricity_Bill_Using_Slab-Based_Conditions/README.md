# Calculate Electricity Bill Using Slab-Based Conditions

| Field | Details |
|---|---|
| **Problem ID** | `34` |
| **Topic** | if, if else, nested if |
| **Difficulty** | 🟡 Medium |
| **Submission Status** | ✅ Solved / Accepted |
| **Author** | [@Kamali](https://github.com/Kamali) |
| **Date** | 2026-10-03T14:52:30.494Z |

## Problem Description

Calculate electricity bill based on consumed units U according to slabs:
- First 100 units: 1.50 per unit
- Next 100 units (101-200): 2.50 per unit
- Next 100 units (201-300): 4.00 per unit
- Above 300 units: 6.00 per unit
An additional fixed charge of 35.00 is added to every bill. Print total bill formatted to 2 decimal places.

## Explanation

First 100 units * 1.50 = 150.00. Next 50 units * 2.50 = 125.00. Surcharge = 35.00. Total = 150 + 125 + 35 = 310.00.

## Solution

- **Language:** Java
- **Source Code:** [`Solution.java`](./Solution.java)

---

*Pushed from [Placement Practice Portal](https://practice-portal-mu.vercel.app) • [View Commit](https://github.com/kamalikasenthilnaathan09/java/commit/bde33fa7c29861717fcf2ff7f2083fab0a508dd7)*
