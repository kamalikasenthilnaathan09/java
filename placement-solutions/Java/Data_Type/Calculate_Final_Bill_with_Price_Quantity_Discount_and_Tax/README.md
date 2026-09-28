# Calculate Final Bill with Price, Quantity, Discount, and Tax

| Field | Details |
|---|---|
| **Problem ID** | `10` |
| **Topic** | Data Type |
| **Difficulty** | 🟡 Medium |
| **Submission Status** | ✅ Solved / Accepted |
| **Author** | [@Kamali](https://github.com/Kamali) |
| **Date** | 2026-09-28T00:53:06.782Z |

## Problem Description

Given item unit price (double), quantity (int), discount percentage (double), and tax percentage (double): calculate the subtotal = price * quantity, apply discount = subtotal * (discount / 100.0), then apply tax on discounted amount = discountedAmount * (tax / 100.0). Final Bill = discountedAmount + taxAmount. Print the final bill formatted to 2 decimal places.

## Explanation

Subtotal = 50.0 * 4 = 200.00. Discount (10%) = 20.00 -> After discount = 180.00. Tax (5% of 180) = 9.00. Total = 189.00.

## Solution

- **Language:** Java
- **Source Code:** [`Solution.java`](./Solution.java)

---

*Pushed from [Placement Practice Portal](https://practice-portal-mu.vercel.app) • [View Commit](https://github.com/kamalikasenthilnaathan09/java/commit/cc8f2c54ceaf61deef3018a9a89b2c6b9347ac06)*
