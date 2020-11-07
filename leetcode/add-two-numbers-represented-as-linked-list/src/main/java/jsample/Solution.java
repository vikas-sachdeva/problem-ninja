package jsample;

public class Solution {

    public ListNode solve(ListNode l1, ListNode l2) {
        int l1Size = findSize(l1);
        int l2Size = findSize(l2);
        ListNode newL1 = l1;
        ListNode newL2 = l2;
        if (l1Size > l2Size) {
            newL2 = increaseListSize(l2, l1Size - l2Size);
        } else {
            newL1 = increaseListSize(l1, l2Size - l1Size);
        }
        ListNode addedList = new ListNode(0);
        int carryOver = addAndFindCarryOver(newL1, newL2, addedList);
        if (carryOver != 0) {
            addedList.val = carryOver;
            return addedList;
        } else {
            return addedList.next;
        }
    }

    private int findSize(ListNode list) {
        int size = 0;
        ListNode temp = list;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    private int addAndFindCarryOver(ListNode l1, ListNode l2, ListNode addedList) {
        if (l1 == null) {
            return 0;
        }
        addedList.next = new ListNode();
        int val = l1.val + l2.val + addAndFindCarryOver(l1.next, l2.next, addedList.next);
        int carryOver = 0;
        if (val > 9) {
            carryOver = val / 10;
            addedList.next.val = val % 10;
        } else {
            addedList.next.val = val;
        }
        return carryOver;
    }

    private ListNode increaseListSize(ListNode temp, int increment) {
        int i = 0;
        while (i < increment) {
            temp = new ListNode(0, temp);
            i++;
        }
        return temp;
    }
}