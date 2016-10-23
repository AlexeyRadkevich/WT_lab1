package core;

public class MixerIncreasingSequences {

	public static int[] Mix(int[] arr, int[] arr2) {
		int[] answer = new int[arr.length + arr2.length];
		int i = 0, j = 0, k = 0;

		while (i < arr.length && j < arr2.length) {
			if (arr[i] < arr2[j])
				answer[k++] = arr[i++];
			else
				answer[k++] = arr2[j++];
		}
		while (i < arr.length)
			answer[k++] = arr[i++];
		while (j < arr2.length)
			answer[k++] = arr2[j++];

		return answer;
	}

}
