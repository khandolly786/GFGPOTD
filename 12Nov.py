class Solution:
    def canAttend(self, arr):
        # Step 1: Sort the array of meetings by their start time
        arr.sort(key=lambda x: x[0])

        # Step 2: Check for overlapping meetings
        for i in range(1, len(arr)):
            # If the start time of the current meeting is less than the end time of the previous meeting
            if arr[i][0] < arr[i - 1][1]:
                return False  # Overlap found, so not possible to attend all meetings

        # If no overlaps are found, it's possible to attend all meetings
        return True
