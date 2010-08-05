	/** Magical SHA1 used for file adds or deletes */
	static final AbbreviatedObjectId A_ZERO = AbbreviatedObjectId
			entry.newPath = entry.oldPath = walk.getPathString();
				entry.oldPath = DiffEntry.DEV_NULL;
				entry.newPath = DiffEntry.DEV_NULL;
		e.oldPath = DEV_NULL;
		e.newPath = path;
		e.oldPath = path;
		e.newPath = DEV_NULL;
		e.oldPath = path;
		e.newPath = path;
	/**
	 * Breaks apart a DiffEntry into two entries, one DELETE and one ADD.
	 *
	 * @param entry
	 *            the DiffEntry to break apart.
	 * @return a list containing two entries. Calling {@link #getChangeType()}
	 *         on the first entry will return ChangeType.DELETE. Calling it on
	 *         the second entry will return ChangeType.ADD.
	 */
		del.oldPath = entry.getOldPath();
		del.newPath = DiffEntry.DEV_NULL;
		add.oldPath = DiffEntry.DEV_NULL;
		add.newPath = entry.getNewPath();
		r.oldPath = src.oldPath;
		r.newPath = dst.newPath;
	protected String oldPath;
	protected String newPath;
	 * <li><i>file modify</i>: always {@link #getNewPath()}</li>
	public String getOldPath() {
		return oldPath;
	 * <li><i>file modify</i>: always {@link #getOldPath()}</li>
	public String getNewPath() {
		return newPath;
	/** @return the type of change this patch makes on {@link #getNewPath()} */
	 * @return similarity score between {@link #getOldPath()} and
	 *         {@link #getNewPath()} if {@link #getChangeType()} is
			buf.append(newPath);
			buf.append(oldPath + "->" + newPath);
			buf.append(oldPath);
			buf.append(oldPath);
			buf.append(oldPath + "->" + newPath);